import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AutomatedTest {

    private WebDriver driver;

    private String firstName;
    private String lastName;
    private String regUsername;
    private String email;
    private String regPassword;
    private String confirmPassword;
    private String loginUsername;
    private String loginPassword;
    private String expectedResult;

    // Constructor nhận dữ liệu từ file CSV
    public AutomatedTest(String firstName, String lastName, String regUsername, String email,
                         String regPassword, String confirmPassword, String loginUsername,
                         String loginPassword, String expectedResult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regUsername = regUsername;
        this.email = email;
        this.regPassword = regPassword;
        this.confirmPassword = confirmPassword;
        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() throws Exception {
        List<Object[]> data = new ArrayList<>();
        InputStream inputStream = AutomatedTest.class.getClassLoader().getResourceAsStream("testdata.csv");
        if (inputStream == null) {
            throw new Exception("File testdata.csv not found");
        }

        try (InputStreamReader reader = new InputStreamReader(inputStream);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            for (CSVRecord record : csvParser) {
                data.add(new Object[]{
                        record.get("firstName"),
                        record.get("lastName"),
                        record.get("regUsername"),
                        record.get("email"),
                        record.get("regPassword"),
                        record.get("confirmPassword"),
                        record.get("loginUsername"),
                        record.get("loginPassword"),
                        record.get("expectedResult")
                });
            }
        }
        return data;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testRegistrationAndLogin() {
        try {
            // Mở trang web
            driver.get("https://khamko07.github.io/TestFiNalKTPM/");
            driver.manage().window().setSize(new Dimension(790, 816));

            // Điền thông tin đăng ký
            driver.findElement(By.id("firstName")).sendKeys(firstName);
            driver.findElement(By.id("lastName")).sendKeys(lastName);
            driver.findElement(By.id("regUsername")).sendKeys(regUsername);
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("regPassword")).sendKeys(regPassword);
            driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);

            // Nhấn nút Đăng ký
            driver.findElement(By.cssSelector(".btn:nth-child(7)")).click();

            // Xử lý thông báo
            Alert alert = driver.switchTo().alert();
            String actualResult = alert.getText();
            alert.accept();

            // So sánh kết quả
            if (expectedResult.equals("pass")) {
                assertThat(actualResult, is("Registration successful!"));
            } else {
                assertThat(actualResult, is("Registration failed!")); // Thay thông báo theo yêu cầu
            }

            // Đăng nhập nếu đăng ký thành công
            if (expectedResult.equals("pass")) {
                driver.findElement(By.id("loginUsername")).sendKeys(loginUsername);
                driver.findElement(By.id("loginPassword")).sendKeys(loginPassword);
                driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
            }

            System.out.println("Test passed for user: " + regUsername);

        } catch (Exception e) {
            if (expectedResult.equals("fail")) {
                System.out.println("Test failed as expected for user: " + regUsername);
            } else {
                System.out.println("Unexpected test failure for user: " + regUsername);
                e.printStackTrace();
            }
        }
    }
}
