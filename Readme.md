# Authentication System

This project is a simple authentication system that includes user registration and login functionality. It is built using HTML, CSS, and JavaScript.

## Features

- User Registration
  - First Name
  - Last Name
  - Username
  - Email
  - Password
  - Confirm Password
- User Login
- Password Strength Indicator
- Password Visibility Toggle
- Form Validation
- Error Messages
- Local Storage for User Data

## File Structure

- `index.html`: Contains the registration and login forms along with the necessary JavaScript for form validation and user authentication.
- `HomePage.html`: The home page that users are redirected to after a successful login.

## Usage

1. Open `index.html` in your web browser.
2. Register a new user by filling out the registration form.
3. Login with the registered username and password.
4. Upon successful login, you will be redirected to `HomePage.html`.

## Scripts

- `togglePassword(inputId)`: Toggles the visibility of the password input field.
- `validatePassword(password)`: Validates the strength of the password.
- `showError(inputId, message)`: Displays an error message for the specified input field.
- `hideError(inputId)`: Hides the error message for the specified input field.
- `switchForm()`: Switches between the login and registration forms.

## Styles

The project uses custom CSS for styling the forms and other elements. The styles are included within the `<style>` tags in the `index.html` and `HomePage.html` files.

## Dependencies

- [Font Awesome](https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css) for the password visibility toggle icons.

## License

This project is licensed under the MIT License.

## Demo live: https://khamko07.github.io/TestFiNalKTPM/ 
