# SOLID Principles Java Examples

This repository contains Java code examples demonstrating the SOLID principles of object-oriented design: Single Responsibility Principle (SRP), Open/Closed Principle (OCP), Liskov Substitution Principle (LSP), Interface Segregation Principle (ISP), and Dependency Inversion Principle (DIP).

## Table of Contents
- [Overview](#overview)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  - [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  - [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  - [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
- [Benefits of SOLID Principles](#benefits-of-solid-principles)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Overview

The SOLID principles are a set of guidelines for designing software systems that are easy to understand, maintain, and extend. Each principle addresses a specific aspect of object-oriented design, promoting modular, flexible, and scalable code.

### Single Responsibility Principle (SRP)

The SRP states that a class should have only one reason to change. It encourages designing classes that are focused and have a clear purpose. In our example, we created an `EmailService` class responsible for sending emails.

### Open/Closed Principle (OCP)

The OCP states that software entities should be open for extension but closed for modification. This means that you should be able to extend the behavior of a system without modifying its existing code. In our example, we demonstrated this by creating a `Shape` hierarchy where new shapes can be added without modifying existing code.

### Liskov Substitution Principle (LSP)

The LSP states that objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program. In our example, we created a bird hierarchy where instances of subclasses (`Duck` and `Sparrow`) can be substituted for instances of the superclass (`Bird`) without issues.

### Interface Segregation Principle (ISP)

The ISP states that clients should not be forced to depend on interfaces they do not use. It promotes creating smaller, cohesive interfaces rather than large, monolithic ones. In our example, we designed interfaces (`Workable` and `Breakable`) that are specific to the behavior they represent, and classes implement only the interfaces they need.

### Dependency Inversion Principle (DIP)

The DIP states that high-level modules should not depend on low-level modules; both should depend on abstractions. It promotes loose coupling between modules by relying on abstractions rather than concrete implementations. In our example, we created a system where high-level modules (`NotificationManager`) depend on abstractions (`NotificationService`), allowing flexibility and ease of extension.

## Benefits of SOLID Principles

- **Maintainability**: By adhering to SOLID principles, code becomes easier to maintain and modify as each principle promotes modular design and separation of concerns.
- **Flexibility**: SOLID principles allow for easier extension and modification of code without risking the introduction of bugs or unintended behavior.
- **Scalability**: With SOLID principles, codebases can more easily scale as new features are added, and changes are made to existing functionality.
- **Reusability**: By designing classes with a single responsibility and promoting loose coupling, SOLID principles encourage reusable and composable code.

## Getting Started

To run the code examples, you'll need Java installed on your machine. Clone this repository and navigate to the directory containing the Java files. Compile and run the Java files using your preferred Java compiler or IDE.

## Contributing

Contributions to improve existing examples or add new ones are welcome! Fork this repository, make your changes, and submit a pull request.
