# Dự án Kiểm thử tự động với Selenium ( Script kiểm thử là trong folder BanTest01 )

## Thông tin nhóm và phân công công việc
Nhóm gồm 6 thành viên:
1. **Nguyễn Thúy Hằng** - Nhóm trưởng, Viết script kiểm thử, kiểm tra script
2. **Nguyễn Trung Kiên** - Viết script kiểm thử, kiểm tra và chỉnh sửa script
3. **Xaiyasith Khamko** - Viết script kiểm thử, chỉnh sửa script, tạo trang web đăng ký và đăng nhập để kiểm thử
4. **Bạch Gia Huy** -Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử
5. **Triệu Thị Hồng Thương** - Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử
6. **Keobounthone Khampasong** - Viết script kiểm thử, tạo trang web đăng ký và đăng nhập để kiểm thử



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
1. Test case với các trường dữ liệu trống
2. Test case đăng ký và đăng nhập thành công với dữ liệu hợp lệ
3. Test case thiếu First Name
4. Test case thiếu Last Name 
5. Test case thiếu Username
6. Test case thiếu Email
7. Test case thiếu Password
8. Test case thiếu Confirm Password
9. Test case mật khẩu quá ngắn
10. Test case mật khẩu thiếu chữ hoa
11. Test case mật khẩu thiếu ký tự đặc biệt
12. Test case mật khẩu thiếu số
13. Test case mật khẩu xác nhận không khớp
14. Test case First Name chứa ký tự đặc biệt
15. Test case Username ngắn
16. Test case Username chỉ chứa số
17. Test case Email sai định dạng (thiếu @)
18. Test case Email sai định dạng (thiếu domain)

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

## Demo web để kiểm thử
- Let's go: https://khamko07.github.io/TestFiNalKTPM/ 

## Thanks
_"Chúc cô một năm mới sắp tới thật nhiều sức khỏe, niềm vui và thành công trong mọi công việc. Cảm ơn cô đã luôn tận tâm dạy dỗ và truyền cảm hứng cho chúng em!"_

_Trân trọng_

_Nhóm 9_

![Thanks](meme.jpg)
