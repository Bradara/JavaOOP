package Mankind;

public class Worker extends Human {
    private double salary;
    private double hoursPerDay;
    private double salaryPerHour;


    Worker(String firstname, String lastname, double salary, double hoursPerDay) {
        super.setFirstname(firstname);
        this.setLastname(lastname);
        this.setSalary(salary);
        this.setHoursPerDay(hoursPerDay);
        this.setSalaryPerHour();
    }

    void setSalaryPerHour() {
        this.salaryPerHour = this.salary / 7 / this.hoursPerDay;
    }

    void setSalary(double salary) {
        if (salary < 11) {
            throw new IllegalArgumentException(String.format("Expected value mismatch!Argument: %.2f%n", salary));
        }
        this.salary = salary;
    }

    void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException(String.format("Expected value mismatch!Argument: %.0f%n", hoursPerDay));
        }

        this.hoursPerDay = hoursPerDay;
    }

    @Override
    void setLastname(String lastName) {
        if (Character.isLowerCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(String.format("Expected upper case letter!Argument: %s%n", lastName));
        } else if (lastName.length() < 4) {
            throw new IllegalArgumentException(String.format("Expected length more than 3 symbols!Argument: %s%n", lastName));
        }

        this.lastname = lastName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Week Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f%n", this.salary, this.hoursPerDay, this.salaryPerHour);
    }
}
