# Student Report Manager

A simple console-based Java application to manage student records. The program allows you to register students, view all registered students, search for specific students, and update existing records.

## Features

- Add new students with roll number, name, and marks.
- View a list of all registered students.
- Search for a student by name or roll number.
- Update existing student details.
- User-friendly text-based menu.

## Getting Started

### Prerequisites
- Java 11 or higher

### Compile
```bash
javac $(find src -name "*.java")
```

### Run
```bash
java -cp src MainApp.App
```

## Project Structure
```
src/
 ├─ MainApp/          # Application entry point and menus
 ├─ Services/         # Business logic for managing students
 ├─ Student/          # Student model
 └─ Utils/            # Helper utilities for input handling
```

## License

This project is provided for educational purposes.
