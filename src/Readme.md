
# 🚗 Car Rental System | Low-Level Design (LLD)

A clean, production-ready, and interview-oriented Low-Level Design (LLD) implementation of a **Car Rental System** using **Java** and **Object-Oriented Design Principles**. This repository demonstrates how to model a complex real-world domain using class hierarchies, dynamic composition, aggregation, enum mappings, and decoupled components.

> ⭐ Designed specifically for **SDE LLD Interviews** (Amazon, Microsoft, Walmart, Flipkart, Adobe, Uber, Google, etc.)

---

## 📌 Key System Features

* 👤 **User Management**: Role-based base accounts for Customers and Receptionists.
* 🚘 **Diverse Vehicle Types**: Base Vehicle engine extended to Cars, Vans, Motorcycles, and Trucks with specific sub-categories.
* 📅 **Reservation Lifecycle**: State tracking across creation, confirmation, cancellation, and completion.
* 🏢 **Branch Operations**: Management of multi-location inventory and parking stalls.
* 🅿️ **Parking Stall Allocation**: Real-time occupation and assignment tracking per stall.
* 🛠️ **Add-on Equipment**: Dynamic equipment attachments like Ski Racks, Child Seats, and GPS.
* ⭐ **Extra Services**: Service add-ons such as Driver Hiring, Wi-Fi Access, and Roadside Assistance.
* 📜 **Vehicle Audit Logs**: Comprehensive historical event logging per vehicle.
* 💰 **Fine & Overdue System**: Calculation and association of late return fees.
* 🔔 **Notification Engine**: User alert delivery triggers.

---

## 🎨 Visual UML Class Diagram

```text
                 +-----------------------------------+
                 |        «abstract» Account         |
                 +-----------------------------------+
                 | - id: String                      |
                 | - name: String                    |
                 | - email: String                   |
                 +-----------------------------------+
                 | + login(): boolean                |
                 | + logout(): void                  |
                 +-----------------------------------+
                                   ▲
                                   |
           +-----------------------+-----------------------+
           |                                               |
+----------------------+                       +-----------------------+
|       Customer       |                       |     Receptionist      |
+----------------------+                       +-----------------------+
| - totalRentals: int  |                       | - employeeId: String  |
+----------------------+                       +-----------------------+
| + makeReservation()  |                       | + addVehicle()        |
| + cancelReservation()|                       | + removeVehicle()     |
+----------------------+                       +-----------------------+

                                  
                 +-----------------------------------+
                 |        «abstract» Vehicle         |
                 +-----------------------------------+
                 | - vehicleId: String               |
                 | - model: String                   |
                 | - dailyRate: double               |
                 | - isAvailable: boolean            |
                 | - logs: List<VehicleLog>          |
                 +-----------------------------------+
                 | + reserve(): boolean              |
                 | + returnVehicle(): boolean        |
                 | + isAvailable(): boolean          |
                 +-----------------------------------+
                                   ▲
         +-----------------+-------+-------+-----------------+
         |                 |               |                 |
+-----------------+ +-------------+ +--------------+ +--------------+
|       Car       | |     Van     | |  Motorcycle  | |    Truck     |
+-----------------+ +-------------+ +--------------+ +--------------+
| - carType       | | - vanType   | | - motoType   | | - truckType  |
+-----------------+ +-------------+ +--------------+ +--------------+


+-------------------+               +-------------------+
|      Branch       | 1           * |   ParkingStall    |
+-------------------+---------------|-------------------| (Composition)
| - branchId        |               | - stallId         |
| - name            |               | - isOccupied      |
| - location        |               +-------------------+
+-------------------+               | + assignVehicle() |
| + addVehicle()    |               | + releaseStall()  |
+-------------------+               +-------------------+


+-------------------------------------------------------+
|                      Reservation                      |
+-------------------------------------------------------+
| - reservationId: String                               |
| - customer: Customer                                  |
| - vehicle: Vehicle                                    |
| - equipments: List<Equipment>                         |
| - services: List<Service>                             |
| - fine: Fine                                          |
| - notification: Notification                          |
+-------------------------------------------------------+
| + createReservation()                                 |
| + confirmReservation()                                |
| + cancelReservation()                                 |
| + completeReservation()                               |
+-------------------------------------------------------+

# 📂 Project Structure

```
src
│
├── constants
│   ├── AccountType.java
│   ├── VehicleType.java
│   ├── CarType.java
│   ├── VanType.java
│   ├── TruckType.java
│   ├── MotorcycleType.java
│   ├── ReservationStatus.java
│   ├── EquipmentType.java
│   └── ServiceType.java
│
├── models
│   ├── Account.java
│   ├── Customer.java
│   ├── Receptionist.java
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Van.java
│   ├── Motorcycle.java
│   ├── Truck.java
│   ├── Branch.java
│   ├── ParkingStall.java
│   ├── Reservation.java
│   ├── Equipment.java
│   ├── Service.java
│   ├── VehicleLog.java
│   ├── Fine.java
│   └── Notification.java
│
└── Main.java
```

---

# 📖 Class Relationships

| Class | Relationship | Class |
|---------|-------------|--------|
| Account | Parent | Customer |
| Account | Parent | Receptionist |
| Vehicle | Parent | Car |
| Vehicle | Parent | Van |
| Vehicle | Parent | Truck |
| Vehicle | Parent | Motorcycle |
| Customer | Association | Reservation |
| Reservation | Association | Vehicle |
| Branch | Aggregation | Vehicle |
| Branch | Composition | ParkingStall |
| Reservation | Association | Equipment |
| Reservation | Association | Service |
| Reservation | Association | Fine |
| Reservation | Association | Notification |
| Vehicle | Composition | VehicleLog |

---

# 🚀 Implemented Functionalities

### 👤 Account
- Login
- Logout

### 👥 Customer
- Make Reservation
- Cancel Reservation

### 👨‍💼 Receptionist
- Add Vehicle
- Remove Vehicle

### 🚘 Vehicle
- Reserve Vehicle
- Return Vehicle
- Availability Check

### 📅 Reservation
- Create Reservation
- Confirm Reservation
- Cancel Reservation
- Complete Reservation

### 🏢 Branch
- Add Vehicle
- Remove Vehicle
- View Vehicles

### 🅿️ Parking
- Assign Vehicle
- Remove Vehicle
- Check Occupancy

### 🔔 Notification
- Send Notification

### 💰 Fine
- Fine Amount

### 📜 Vehicle Log
- Maintain Vehicle History

---

# 💻 Sample Execution

```
Customer Login Successful

Reservation Status : CONFIRMED

GPS Cost : 300.0

Driver Cost : 800.0

Parking Occupied : true

24-07-2026 : Vehicle Issued

Fine Amount : 500.0

Notification : Your vehicle has been successfully booked.

Reservation Status : COMPLETED

Somnath logged out.
```

---

# 🎯 OOP Concepts Used

- ✅ Abstraction
- ✅ Encapsulation
- ✅ Inheritance
- ✅ Polymorphism
- ✅ Association
- ✅ Aggregation
- ✅ Composition

---

# 📚 Design Principles

- SOLID Principles
- High Cohesion
- Low Coupling
- Single Responsibility Principle (SRP)
- Open Closed Principle (OCP)

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming
- UML Class Diagram
- IntelliJ IDEA

---

# 🎯 Interview Focus

This project is ideal for practicing **Low-Level Design Interviews**.

It covers:

- UML Class Diagram
- Class Relationships
- Inheritance
- Association
- Composition
- Aggregation
- Java OOP
- Basic System Design
- Interview Coding Style

---

# 🚀 Future Improvements

- Payment Module
- Billing System
- Search Vehicles
- Pricing Strategy
- Discount Coupons
- Factory Design Pattern
- Strategy Design Pattern
- Singleton Pattern
- Observer Pattern
- REST API Integration
- Database Support
- Spring Boot Version

---

# ⭐ If you found this project helpful, don't forget to star the repository!

Happy Coding! 🚀
