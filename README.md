# 🛒 DeFacto E-Commerce Automation Testing Project

🔗 **Project Source Code:**  
👉 [DeFacto Automation Testing Project](https://github.com/ahmedsherifff4/DefactoAutomationTesting/blob/ed82c8b67a20322d713ba6c10aee49123a363229/DefactoAutomationTesting.java)

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
           └── ODCxINSTANT_Project
                └── DefactoAutomationTesting.java
```

---

## ▶ How To Run The Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/your-repository-link.git
```

### 2️⃣ Open in IntelliJ IDEA

### 3️⃣ Make Sure:
- Chrome Browser is installed
- Compatible ChromeDriver version is available
- Maven dependencies are resolved (if using Maven)

### 4️⃣ Run Tests

Run directly:
```
DefactoAutomationTesting.java
```

Or via TestNG XML file (if configured).

---

## 🎯 Key Learning Outcomes

- Handling dynamic web elements
- Synchronization using Explicit Wait
- Managing execution order with TestNG
- Working with Assertions & Validations
- Automating complete E-commerce workflows
- Real-world project structuring

---

## 📈 Future Enhancements

- Implement Page Object Model (POM)
- Replace Thread.sleep with advanced synchronization
- Add Reporting (Extent Reports / Allure)
- Cross-browser testing support
- CI/CD integration (GitHub Actions / Jenkins)

---

## 👨‍💻 Author

Ahmed Sherif  
Automation Testing Trainee  
Orange Digital Center Egypt × Instant Software Solutions  

---

⭐ If you found this project useful, feel free to star the repository.
