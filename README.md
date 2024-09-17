# Menu Driven Student Management System

## Overview

The **Menu Driven Student Management System** is a Java CLI application developed for the purpose of understanding JDBC and SQL. This project demonstrates how to use JDBC to perform CRUD operations on a MySQL database in a practical, interactive manner.

## Features

- **Add Student**: Insert a new student's details into the database.
- **Display Students**: List all students.
- **Search Student**: Find a student by ID.
- **Remove Student**: Delete a student by ID.
- **Update Student**: Modify an existing student's details.

## Technologies

- **Java**: Core programming language.
- **JDBC**: Java Database Connectivity for interfacing with MySQL.
- **MySQL**: Database system used for storing student records.

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- MySQL 5.7 or higher
- JDBC Driver for MySQL

### Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/MenuDrivenStudentManagement-JDBC.git
   ```
2. **Configure the Database:** Run the following SQL commands in MySQL:
   
```sql
-- Create the StudentDB database
CREATE DATABASE StudentDB;

-- Select the StudentDB database for use
USE StudentDB;

-- Create the students table
CREATE TABLE students (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(100),
   age INT,
   sgpa DOUBLE,
   phone_number VARCHAR(15)
);
```

3. **Update JDBC Configuration:** Modify the JDBC connection details in your Java code:
   ```java
   String url = "jdbc:mysql://localhost:3306/StudentDB";
   String username = "yourUsername";
   String password = "yourPassword";
   ```
4. **Compile and Run:**
   ```java
   javac com/StudentManagementCRUD/Main.java
   java com.StudentManagementCRUD.Main
   ```
## Usage
After running the application, you will see a menu with the following options:
1. **Add Student:** Input details to add a student.
2. **Display Students:** View all student records.
3. **Search Student:** Locate a student by ID.
4. **Remove Student:** Delete a student by ID.
5. **Update Student:** Edit an existing student's details.
6. **Exit:** Close the application.

## Purpose
This project is intended to provide hands-on experience with JDBC and SQL, illustrating how to perform common database operations using Java.

## Future Enhancements
- Input validation for fields.
- Error handling for database operations.
- Additional search filters.
- GUI integration for a better user experience.

