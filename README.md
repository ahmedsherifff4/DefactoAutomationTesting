# 🛒 DeFacto E-Commerce Automation Testing Project

🔗 **Project Source Code:**  
👉 https://github.com/your-username/your-repository-link  

---

## 📌 Project Overview

This project is an End-to-End Automation Testing framework developed for the DeFacto Egypt e-commerce website.

The automation suite simulates real user journeys and validates critical business functionalities using:

- Java
- Selenium WebDriver
- TestNG
- ChromeDriver
- Explicit Waits (WebDriverWait)
- TestNG Assertions

The goal of this project is to automate real-world E-commerce workflows and validate system behavior under multiple user scenarios.

---

## 🚀 Automated Test Coverage

### 🔐 Authentication Module
- Login with empty email validation
- Valid login scenario
- Logout validation

### 🛍 Shopping & Cart Module
- Navigate product categories
- View product details
- Add product to Wishlist
- Add product to Cart
- Increase product quantity
- Decrease product quantity
- Remove product from cart

### 🔎 Search & Filtering Module
- Search for products (e.g., Jeans)
- Navigate Sale section
- Apply price sorting (Descending)
- Apply filters and validate results

### 🌍 Localization Testing
- Switch language between English & Arabic
- Validate UI text after language change

### 📦 Orders Module
- Access "My Orders" from user menu
- Validate successful redirection to Order List page

---

## 🏗 Framework Design

- `@BeforeClass` → Browser setup & initialization
- `@Test(priority=)` → Structured test execution flow
- `@AfterClass` → Driver teardown
- Explicit Wait used for dynamic synchronization
- Assertions used for validating expected behavior

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Selenium WebDriver | Browser Automation |
| TestNG | Test Execution & Assertions |
| ChromeDriver | Browser Driver |
| IntelliJ IDEA | IDE |

---

## 📂 Project Structure

```
src
 └── test
      └── java
