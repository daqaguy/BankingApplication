# Banking Application

A simple console-based banking application in Java that simulates basic functionalities like user login, deposits, and withdrawals. This application demonstrates the use of abstract classes, interfaces, constructors, and access modifiers.

## Features

- User login system with basic authentication.
- Account operations including deposit and withdrawal.
- Demonstrates object-oriented principles in Java: abstract classes, interfaces, inheritance, and encapsulation.

## Project Structure

- **Abstract Class (`Account`)**: Represents a generic account with basic functionalities.
- **Interface (`Transaction`)**: Defines the contract for deposit and withdrawal methods.
- **Class (`CheckingAccount`)**: Implements `Transaction` and extends `Account` for checking account functionality.
- **Class (`User`)**: Represents a bank user with login credentials and an associated checking account.
- **Main Class (`BankingApplication`)**: Contains the main method to test the login and transaction features.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) version 8 or later.

### Running the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/banking-application.git
   cd banking-application

2. Compile the Java files:
   javac BankingApplication.java

3. Run the application:
   java BankingApplication

Example Usage
The application prompts for user login. If the login credentials match, the user can perform deposit and withdrawal transactions.

Sample console output:
Login successful!
Deposited 200. Balance: 700.0
Withdrew 150. Balance: 550.0

Contributing
Feel free to open issues or submit pull requests if you'd like to contribute.
