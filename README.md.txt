# 🛒 DeFacto E-Commerce Automation Testing Project

## 📌 Project Overview

This project is an end-to-end Automation Testing framework developed for the DeFacto Egypt e-commerce website.

The automation suite simulates real user journeys and validates critical functionalities using:

- Java
- Selenium WebDriver
- TestNG
- ChromeDriver
- Explicit Waits (WebDriverWait)
- Assertions (TestNG)

The goal of this project is to automate real-world e-commerce workflows and validate system behavior under different user scenarios.

---

## 🚀 Automated Test Scenarios

### 🔐 Authentication
- Login with empty email validation
- Valid login scenario
- Logout validation

### 🛍 Product & Shopping Flow
- Navigate product categories
- View product details
- Add product to Wishlist
- Add product to Cart
- Increase & decrease product quantity
- Remove product from cart

### 🔎 Search & Filtering
- Search for products
- Apply Sale filters
- Sort products by price (Descending)

### 🌍 Localization
- Switch language between English and Arabic
- Verify UI elements after language change

### 📦 Orders
- Access "My Orders" from user menu
- Validate redirection to order list page

---

## 🏗 Framework Structure

- `@BeforeClass` → Browser setup and initialization
- `@Test(priority=)` → Organized test execution order
- `@AfterClass` → Driver teardown
- Explicit Waits used for dynamic elements
- Assertions used for validation

---

## 🛠 Tools & Technologies

| Tool | Purpose |
|------|----------|
| Java | Programming Language |
| Selenium WebDriver | Browser Automation |
| TestNG | Test Management & Assertions |
| ChromeDriver | Browser Driver |
| IntelliJ IDEA | Development IDE |

---

## ▶ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/your-username/your-repo-name.git
```

2. Open the project in IntelliJ IDEA.

3. Make sure:
   - Chrome browser is installed.
   - Compatible ChromeDriver version is available.
   - Maven dependencies are installed (if using Maven).

4. Run the TestNG class:

```
DefactoAutomationTesting.java
```

Or run using TestNG XML file if configured.

---

## 🎯 Key Learning Outcomes

- Handling dynamic web elements
- Synchronization using Explicit Wait
- Managing test execution order with TestNG
- Real-world E-commerce workflow automation
- Assertions & validation techniques
- Java-based automation framework structure

---

## 📈 Future Improvements

- Implement Page Object Model (POM)
- Replace Thread.sleep with better synchronization
- Add Reporting (Extent Reports / Allure)
- Add Cross-browser testing
- Integrate with CI/CD (Jenkins / GitHub Actions)

---

## 👨‍💻 Author

Ahmed Sherif  
Automation Testing Trainee  
Orange Digital Center Egypt × Instant Software Solutions
