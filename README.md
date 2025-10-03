
# projectDaoJdbc

## Overview

**projectDaoJdbc** is a Java application that demonstrates the use of the DAO (Data Access Object) design pattern with JDBC for managing database operations. The project models an example sales system, focusing on two main entities: **Seller** and **Department**. It showcases CRUD (Create, Read, Update, Delete) operations for both entities and provides a clean separation between database access logic and business logic.

## Main Features

- **Entities**:
  - **Seller**: Represents a salesperson, with fields such as id, name, email, birth date, base salary, and associated department.
  - **Department**: Represents a department within the organization, with fields for id and name.

- **DAO Interfaces**:
  - `SellerDao` and `DepartmentDao` define methods for inserting, updating, deleting, and querying `Seller` and `Department` objects.
  - Implementations (`SellerDaoJDBC` and `DepartmentDaoJDBC`) handle actual JDBC operations.

- **Database Connection and Error Handling**:
  - Centralized database connection management in the `db.DB` class.
  - Custom exceptions (`DbException`, `DbIntegrityException`) for robust error handling.

- **Console Demonstrations**:
  - Operations are demonstrated in `Program.java` and `Program2.java`, showing how to use the DAOs for various CRUD operations, including:
    - Insert a new seller or department
    - Update existing records
    - Delete by ID
    - Retrieve by ID, department, or fetch all records

## Example Usage

**Seller Operations (`Program.java`):**
- Find seller by ID
- Find sellers by department
- List all sellers
- Insert new seller
- Update seller information
- Delete seller by ID

**Department Operations (`Program2.java`):**
- Find department by ID
- List all departments
- Insert new department
- Update department
- Delete department by ID

## Architecture

- **DAO Pattern**: Abstracts data persistence operations, making it easy to switch or modify the underlying data access logic.
- **JDBC**: Directly interacts with the relational database using Java's JDBC API.
- **Entities**: Simple POJOs with serialization support and standard getters/setters.
- **Factory**: `DaoFactory` provides instantiation of DAO implementations.

## Project Structure

```
src/
  application/
    Program.java        # Seller CRUD demo
    Program2.java       # Department CRUD demo
  db/
    DB.java             # DB connection management
    DbException.java    # Custom exception for DB errors
    DbIntegrityException.java # Exception for DB integrity violations
  model/
    dao/
      SellerDao.java        # Seller DAO interface
      DepartmentDao.java    # Department DAO interface
      impl/
        SellerDaoJDBC.java      # Seller DAO JDBC implementation
        DepartmentDaoJDBC.java  # Department DAO JDBC implementation
    entities/
      Seller.java         # Seller entity
      Department.java     # Department entity
```

## How to Run

1. **Configure Database**: Ensure you have a compatible relational database (e.g., MySQL or PostgreSQL) and update the database connection properties as needed in the project.

2. **Build and Run**: Compile and run the main classes (`Program.java`, `Program2.java`) to interact with the database through the console.

## Key Classes and Interfaces

- **SellerDao / DepartmentDao**: Define standard CRUD operations.
- **SellerDaoJDBC / DepartmentDaoJDBC**: Actual implementations using JDBC.
- **DB**: Handles connection lifecycle and resource cleanup.
- **Seller / Department**: Entity classes.
- **DbException / DbIntegrityException**: For specialized error handling.

## License

This project is intended as a learning example and does not have a specified license.

---

For further details, refer to the code files for each class and to the `Program.java` and `Program2.java` for usage demonstrations.
````
