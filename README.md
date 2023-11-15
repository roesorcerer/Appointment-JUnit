# README for Appointment Management System

This is a simple Java application for managing appointments using two main classes: `Appointment` and `AppointmentService`. The system allows you to create, retrieve, and delete appointments, as well as perform basic validation checks on appointment data.

## Table of Contents
- [Appointment](#appointment)
- [AppointmentService](#appointmentservice)
- [AppointmentServiceTest](#appointmentservicetest)
- [AppointmentTest](#appointmenttest)

## Appointment
The `Appointment` class represents an individual appointment with the following attributes:

- `appointmentId` (String): A unique identifier for the appointment.
- `appointmentDate` (Date): The date and time of the appointment.
- `description` (String): A description or note about the appointment.

### Usage
To create an `Appointment` object, you can use the constructor as follows:

```java
String appointmentId = "12345";
Date appointmentDate = new Date();
String description = "Test appointment";
Appointment appointment = new Appointment(appointmentId, appointmentDate, description);
```

You can also use the provided getter methods to access the attributes of the appointment:

```java
String id = appointment.getAppointmentId();
Date date = appointment.getAppointmentDate();
String desc = appointment.getDescription();
```

## AppointmentService
The `AppointmentService` class is responsible for managing a collection of appointments using a `Map`. It provides methods to add, delete, retrieve, and list appointments. It also performs basic validation checks when adding appointments.

### Usage
To use the `AppointmentService`, create an instance of the class:

```java
AppointmentService service = new AppointmentService();
```

You can add appointments using the `addAppointment` method:

```java
Appointment appointment = new Appointment("12345", new Date(), "Test appointment");
service.addAppointment(appointment);
```

Other methods provided by `AppointmentService` include `deleteAppointment`, `getAppointment`, and `getAppointments`.

### Validation
The `AppointmentService` enforces the following validation rules when adding appointments:
- Appointment cannot be null.
- Appointment ID must be unique.
- Appointment date cannot be in the past.
- Description cannot be null.
- Description cannot be longer than 50 characters.

## AppointmentServiceTest
The `AppointmentServiceTest` class contains unit tests for the `AppointmentService` class. It uses JUnit to validate the functionality and behavior of the service class.

### Usage
You can run the tests to ensure that the `AppointmentService` functions correctly. The tests cover scenarios such as adding valid appointments, adding null appointments, and adding appointments with duplicate IDs. Additional test cases can be added as needed.

## AppointmentTest
The `AppointmentTest` class contains unit tests for the `Appointment` class. It validates the getter methods of the `Appointment` class to ensure that they return the expected values.

### Usage
These tests are used to verify that the `Appointment` class functions as expected and returns the correct values for its attributes.

## Summary
This appointment management system provides a simple way to create and manage appointments in Java. It includes basic validation checks to ensure data integrity. You can use the provided classes and tests as a foundation and extend the system to meet your specific requirements.
