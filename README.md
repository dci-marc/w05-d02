[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/CIRKfgFF)
# Salary calculator
For this exercise we'll build a simple program within the `Employee` class that has been provided for you. This will help us with some calculations. We'll rely on overloading methods to implement the requirements efficiently.

Some 2 classes have been prepared for you to fill in so as to get the code working as expected.

## Requirements
Build a program that helps with the salary calculation for our employees. The employees of our company have different bonus models, depending on the work they do.
* Sales representatives get a bonus of 10% of their total sales, if their sales exceed 10 000 € in a given month. Otherwise, they get no bonus.
* Engineers get a bonus based on the sales of their designs. For each unit (that they designed) sold, they get 20 €. If the sales in a month exceed 100 units, they get an additional 10 € for each unit.
* Assembly line workers get a bonus of 25 cent for each assembled part if they reach a threshold. Part-time workers must assemble 300 parts to reach the threshold, while full-time employees mus reach 700 parts.

Write the 3 different versions of the `calculateBonus()` method by using parameter overloading.

Study the existing code you see in Employee.java. Your contribution to our 
codebase is the `calculateBonus()` method which is currently missing.

Hint: it will be an overloaded static method.

Grading is automated, if after you have pushed your code and you receive an email from Github about a failure, you have failed. Your mission is to keep trying until the values are correct.

Do not change any test files. You can run test files using the InteliJ IDE as a way to confirm if things are working.

```prompt
Sales representative: 10 001 Euro sales => bonus will be 1000,1 Euro
Engineer: 100 parts => bonus will be 2000
Part time worker: Run the test file testCalculateBonus1Version3()
```