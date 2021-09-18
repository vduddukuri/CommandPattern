# OOD-Week-3-Command-Pattern
### Solution for week 3 assignment using command pattern with undo/redo support

The application is developed for car driving classes. An instructor instructs the student to enter in the car, leave the car, start the car and stop the car.
The **Student** acts as a **Receiver**, the **Instructor** is an **Invoker** whereas different **Command**s bind the instruction with the student. 

The application supports **undo** and **redo** by managing a history. The History class demonstrates the use of **Singleton** pattern.

**JUnit** is used to prepare test case which acts as a **Client**.
