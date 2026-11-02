# Student Records (Java)

A beginner-friendly console application that stores student names and roll numbers using Java's `ArrayList`.

## Features
- Add a student
- Display all students
- Search for a student by roll number
- Validate input and prevent duplicate roll numbers

## Requirements
- JDK 8 or later
- VS Code, IntelliJ IDEA, Eclipse, or any Java IDE (optional)

## Project structure
```text
Student-Records/
├── Student.java
├── StudentRecords.java
└── README.md
```

## How to run

### Option 1: Terminal / Command Prompt
Open a terminal in this folder and run:

```bash
javac Student.java StudentRecords.java
java StudentRecords
```

### Option 2: VS Code
1. Install a JDK and the **Extension Pack for Java**.
2. Open the `Student-Records` folder in VS Code.
3. Open `StudentRecords.java`.
4. Click **Run** above `main`, or use the terminal commands above.

## Sample run
```text
===== STUDENT RECORDS =====
1. Add Student
2. Display All Students
3. Search by Roll Number
4. Exit
Enter your choice: 1
Enter student name: Sneha Basuli
Enter roll number: 101
Student added successfully.

===== STUDENT RECORDS =====
1. Add Student
2. Display All Students
3. Search by Roll Number
4. Exit
Enter your choice: 2

--- All Students ---
Roll Number: 101, Name: Sneha Basuli
```

## Notes
- Records are kept in memory while the program is running; they are not saved after exit.
- This project uses only core Java and does not require a database.

## GitHub repository description
A simple Java console-based Student Records Management System using an `ArrayList`, with options to add students, display all records, and search by roll number.
