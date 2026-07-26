# 📚 Library Management System | Low-Level Design (LLD)

A clean, interview-oriented implementation of a **Library Management System** using **Java** and **Object-Oriented Design (OOD)** principles. This project demonstrates how a real-world library can be modeled using inheritance, abstraction, association, composition, aggregation, and enums.

> ⭐ Designed specifically for **SDE Low-Level Design (LLD) Interviews** at companies like Amazon, Microsoft, Walmart, Adobe, Atlassian, Flipkart, Uber, and more.

---

# 🚀 Features

- 👤 Member & Librarian Management
- 📖 Book & Book Item Management
- 📚 Borrow Books
- 📝 Reserve Books
- 🔄 Return Books
- 🪪 Library Card Management
- 🗂️ Rack Management
- 💰 Fine Calculation
- 🔔 Notification System
- 🔐 Login & Logout
- 📍 Book Availability Tracking
- 🏛️ Library Management

---

# 🏗️ System Design

```
                     Account
                  /            \
           Member            Librarian

                     Book
                       │
                Composition
                       │
                  BookItem
                  /      \
              Rack      BookLending
                           |
                          Fine

Member ---------------- BookReservation

Member ---------------- LibraryCard

BookItem ------------- Notification

Library -------------- BookItem
```

---

# 📂 Project Structure

```
src
│
├── constants
│   ├── AccountType.java
│   ├── BookStatus.java
│   ├── ReservationStatus.java
│   ├── BookFormat.java
│   └── NotificationType.java
│
├── models
│   ├── Account.java
│   ├── Member.java
│   ├── Librarian.java
│   ├── Book.java
│   ├── BookItem.java
│   ├── Rack.java
│   ├── LibraryCard.java
│   ├── BookReservation.java
│   ├── BookLending.java
│   ├── Fine.java
│   ├── Notification.java
│   └── Library.java
│
└── Main.java
```

---

# 📖 Class Relationships

| Parent Class | Relationship | Child Class |
|---------------|-------------|-------------|
| Account | Inheritance | Member |
| Account | Inheritance | Librarian |
| Book | Composition | BookItem |
| Member | Association | BookLending |
| Member | Association | BookReservation |
| Member | Association | LibraryCard |
| BookItem | Association | Rack |
| BookLending | Association | Fine |
| BookItem | Association | Notification |
| Library | Aggregation | BookItem |

---

# 📌 Functionalities

## 👤 Account

- Login
- Logout

---

## 👥 Member

- Borrow Book
- Return Book
- Reserve Book

---

## 👨‍💼 Librarian

- Add Book
- Remove Book

---

## 📚 Book

- Store Book Information
- Display Book Details

---

## 📖 BookItem

- Check Availability
- Checkout Book
- Return Book
- Reserve Book

---

## 🗂️ Rack

- Store Rack Information

---

## 🪪 Library Card

- Activate Card
- Deactivate Card

---

## 📅 Book Reservation

- Reserve Book
- Cancel Reservation
- Reservation Status

---

## 📕 Book Lending

- Borrow Book
- Return Book
- Fine Calculation

---

## 💰 Fine

- Store Fine Amount

---

## 🔔 Notification

- Send Notifications

---

## 🏛️ Library

- Add Books
- Remove Books
- Display Available Books

---

# 💻 Sample Output

```
Librarian Login Successful

Books Added Successfully

Available Books
--------------------------
ISBN : 9780135166307
Title : Effective Java
Author : Joshua Bloch
Subject : Programming
--------------------
ISBN : 9780073523408
Title : Data Structures
Author : Seymour Lipschutz
Subject : Computer Science
--------------------

Member Login Successful

Book Borrowed Successfully

Reservation Status : COMPLETED

Book Returned Successfully

Fine Amount : ₹30.0

Notification : Book returned successfully.

Somnath logged out.
Admin logged out.
```

---

# 🧠 OOP Concepts Used

- ✅ Abstraction
- ✅ Encapsulation
- ✅ Inheritance
- ✅ Polymorphism
- ✅ Association
- ✅ Aggregation
- ✅ Composition

---

# 📐 SOLID Principles

- Single Responsibility Principle (SRP)
- Open Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- UML Class Diagram
- IntelliJ IDEA

---

# 🎯 LLD Concepts Covered

- UML Class Diagram
- Class Relationships
- Multiplicity
- Object Modeling
- Domain Modeling
- Inheritance
- Composition
- Aggregation
- Association
- Enum Usage
- Constructor Chaining

---

# 📈 Future Enhancements

- Search Books by Title/Author/ISBN
- Multi-Branch Library Support
- Payment Gateway for Fine Collection
- Email/SMS Notifications
- Barcode Scanner Integration
- Book Recommendation System
- Digital Library Support
- Spring Boot REST APIs
- MySQL Database Integration
- Authentication & Authorization
- Admin Dashboard

---

# 📖 Learning Outcomes

After completing this project, you will understand:

- Designing real-world systems using Java
- Applying OOP concepts effectively
- Building interview-ready class diagrams
- Implementing clean Low-Level Design
- Modeling relationships between entities
- Writing maintainable and extensible code

---

# ⭐ If you found this project helpful, consider giving it a star!

Happy Coding! 🚀
