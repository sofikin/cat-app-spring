# Random Cat Viewer - Spring Boot Application

This is a Spring Boot application that displays random cat images. It utilizes the Spring Framework version 2.7.5 and
requires Java 1.8, MySQL version 8.0.21, and Maven version 2.4.1.

## Prerequisites

Before running this application, ensure that the following software is installed on your system:

- Java Development Kit (JDK) version 1.8 or higher
- MySQL database server version 8.0.21 or higher
- Maven build tool version 2.4.1 or higher

## Setup

1. Clone the repository or download the source code.

2. Create a MySQL database for the application. You can use the following command:

   ```bash
   mysql -u <username> -p -e "CREATE DATABASE cats"
   ```
   Replace <username> with your MySQL username. Enter your password when prompted.
3. Import the database structure by executing the following command:
   ```bash
   mysql -u <username> -p cats < database.sql
   ```
   Replace <username> with your MySQL username. Enter your password when prompted. This will import the database
   structure from the database.sql file into the cats database.
4. Open the project in your favorite Java IDE.
5. Modify the database configuration in the `src/main/resources/application.properties` file:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/cats
   spring.datasource.username=<your_mysql_username>
   spring.datasource.password=<your_mysql_password>
   ```
   Replace `<your_mysql_username>` and `<your_mysql_password>` with your MySQL username and password.
6. Build the project using Maven. Open the terminal or command prompt, navigate to the project's root directory, and run
   the following command:
   ```bash
   mvn clean install
   ```
   This will download the required dependencies and build the application.

## Running the Application

Once the build is successful, you can run the Spring Boot application by executing the following command:

```bash
mvn spring-boot:run
```

The application will start, and you should see output indicating that the server is running. You can access the
application by visiting `http://localhost:8080` in your web browser.

## Usage

The Random Cat Viewer application displays random cat images on the homepage. Each time you refresh the page, a new
random cat image will be shown.

## Customization

You can modify the application to add additional features or customize the behavior as per your requirements. Explore
the code and refer to the Spring Boot and Spring Framework documentation for more information.

## License

This project is licensed under the MIT License.

Enjoy the Random Cat Viewer application! If you have any questions or need further assistance, please don't hesitate to
contact us.