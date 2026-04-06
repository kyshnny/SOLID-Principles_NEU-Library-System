# SOLID-Principles_NEU-Library-System

📝 Problem Statement

The NEU Library system currently allows students to borrow resources such as books and journals using methods like:

- borrowBook()
- borrowJournal()

This design tightly couples the Student class to specific resource types, violating the Dependency Inversion Principle (DIP).

The goal is to refactor the system to:

- Follow SOLID principles
- Allow easy addition of new resource types (e.g., AudioBook, E-Journal)
- Improve flexibility and maintainability

UML Class Diagram:

<img width="1048" height="499" alt="Screenshot 2026-04-07 at 1 37 33 AM" src="https://github.com/user-attachments/assets/c980b72d-e0d1-41c1-97f6-085d717d8006" />
