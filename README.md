
# MCQ Login Application

## Overview

This is a JavaFX-based Multiple Choice Question (MCQ) application that includes a login system. The application allows users to log in and participate in MCQ tests.

## Features

- **User Authentication**: Secure login functionality for users.
- **MCQ Test**: Users can take multiple-choice tests within the application.

## Requirements

- Java Development Kit (JDK) 8 or higher
- JavaFX library
- MySQL database
- MySQL Connector/J (e.g., `mysql-connector-java-8.0.28.jar`)

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/MayankChoudhary21/MCQ-application.git
   cd MCQ-application
   ```

2. **Set Up the Database**:
   - Install MySQL and create a database named `mcq_application`.
   - Create a table named `users` with the following structure:
     ```sql
     CREATE TABLE users (
         id INT AUTO_INCREMENT PRIMARY KEY,
         username VARCHAR(50) NOT NULL,
         password VARCHAR(50) NOT NULL
     );
     ```
   - Insert user data as needed.

3. **Configure the Application**:
   - Ensure the MySQL Connector/J (`mysql-connector-java-8.0.28.jar`) is included in your project's classpath.
   - Update the database connection details in the `Jdbc.java` file:
     ```java
     String url = "jdbc:mysql://localhost:3306/mcq_application";
     String user = "your_mysql_username";
     String password = "your_mysql_password";
     ```

4. **Compile and Run**:
   - Compile the Java files:
     ```bash
     javac -cp .:mysql-connector-java-8.0.28.jar *.java
     ```
   - Run the application:
     ```bash
     java -cp .:mysql-connector-java-8.0.28.jar Main
     ```

## Usage

- **Login**: Enter your username and password to access the application.
- **MCQ Test**: Once logged in, you can participate in the MCQ test provided by the application.

## File Structure

- `Main.java`: Entry point of the application.
- `Login.java`: Handles the login functionality.
- `WelcomePage.java`: Displays the welcome page after successful login.
- `Jdbc.java`: Manages database connections.
- `Result.java`: Displays the test results.
- `mysql-connector-java-8.0.28.jar`: MySQL Connector/J library for database connectivity.

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

- **Mayank Choudhary**
- **Venkatesh Indla**
