# Java Automation Testing – Interview Questions & Answers

## 1. What are the advantages of automating tests using a Page Object Model (POM)?
- Improves test maintainability by separating UI locators from test logic
- Enhances reusability of page-level methods across multiple tests
- Makes tests more readable and easier to understand
- Reduces code duplication and simplifies updates when UI changes

## 2. When would you avoid automating a test case?
- When the feature is unstable or frequently changing
- For one-time or rarely executed test cases
- When automation cost is higher than manual execution benefit
- For scenarios requiring subjective validation (e.g., visual appearance)

## 3. What typically causes flaky tests, and how would you reduce flakiness?
- Caused by timing issues, dynamic elements, network delays, or test data dependency
- Use explicit waits instead of hard sleeps
- Ensure proper test data setup and cleanup
- Isolate tests and avoid dependencies between them

## 4. What is the difference between UI tests and API tests, and when is each more suitable?
- UI tests validate end-to-end user flows through the application interface
- API tests validate backend logic, data, and integrations
- UI tests are suitable for user experience validation
- API tests are faster, more stable, and ideal for early testing

## 5. What is the difference between implicit and explicit waits, and in which scenarios should each be used?
- Implicit wait applies globally to all element searches
- Explicit wait waits for a specific condition on a specific element
- Use implicit waits for simple synchronization needs
- Use explicit waits for dynamic elements or complex conditions

## 6. Name three common exceptions and explain when each one occurs.
- **NullPointerException**: Occurs when accessing an object reference that is null
- **NoSuchElementException**: Occurs when a web element cannot be found in the DOM
- **TimeoutException**: Occurs when a condition is not met within the specified wait time  
