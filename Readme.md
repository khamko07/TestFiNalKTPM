# Dự án Kiểm thử tự động với Selenium

## Thông tin nhóm và phân công công việc
Nhóm gồm 6 thành viên:
1. Nguyễn Thúy Hằng - Nhóm trưởng, Viết script kiểm thử, kiểm tra script
2. Nguyễn Trung Kiên - Viết script kiểm thử, kiểm tra và chỉnh sửa script
3. Xaiyasith Khamko - Viết script kiểm thử, chỉnh sửa script, tạo trang web đăng ký và đăng nhập để kiểm thử
4. Bạch Gia Huy -Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử
5. Triệu Thị Hồng Thương - Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử
6. Keobounthone Khampasong - Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử

## Mô tả dự án
- Dự án thực hiện kiểm thử tự động cho chức năng đăng ký và đăng nhập
- Sử dụng Selenium WebDriver để tự động hóa quá trình kiểm thử
- Dữ liệu test được quản lý trong file CSV
- Framework sử dụng: JUnit với Parameterized Tests

## Cấu trúc dự án
- `src/main/java/AutomatedTest.java`: Class chính thực hiện kiểm thử
- `src/main/resources/testdata.csv`: File dữ liệu test
- `pom.xml`: File cấu hình Maven và dependencies

## Các test case
1. Đăng ký thành công và đăng nhập
2. Đăng ký thất bại do mật khẩu xác nhận không khớp
3. Đăng ký thất bại do email không hợp lệ
4. Đăng ký thất bại do mật khẩu quá ngắn

## Hướng dẫn chạy test
1. Clone repository
2. Mở project bằng IDE (IntelliJ IDEA hoặc Eclipse)
3. Cài đặt Chrome WebDriver
4. Chạy lệnh: `mvn test`

## Công nghệ sử dụng
- Java
- Selenium WebDriver
- JUnit 4
- Apache Commons CSV
- Maven

## "Chúc cô một năm mới sắp tới thật nhiều sức khỏe, niềm vui và thành công trong mọi công việc. Cảm ơn cô đã luôn tận tâm dạy dỗ và truyền cảm hứng cho chúng em!" 



![Thanks](meme.jpg)
