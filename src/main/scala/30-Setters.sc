// A class with a getter method

class Employee(var firstName: String, var lastName: String):

  private var _salary = 0d

  def salary: Double = _salary

  def fullName: String = s"$firstName $lastName"

  def increaseSalary(amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    if amount > 0 then _salary += amount
  }

end Employee

// Uniform Access Principle:
//   We access properties and methods in the same way

val emp = Employee("Alice", "Smith")
emp.increaseSalary(5000)
println(s"${emp.fullName} has a salary of ${emp.salary}")

// Adding a setter method

class Employee2(var firstName: String, var lastName: String):
  private var _salary = 0d

  def salary: Double = _salary

  // this is the new setter method:
  def salary_=(newSalary: Double): Unit =
    require(newSalary >= 0, "Salary cannot be negative")
    _salary = newSalary

  def fullName: String = s"$firstName $lastName"
end Employee2

val emp2 = Employee2("Bob", "Johnson")
emp2.salary = 6000 // emp2.setSalary(6000)
