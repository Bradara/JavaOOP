package Mankind;

public class Student extends Human {
    private String facultyNumber;

    Student(String firstname, String lastname, String facultyNumber) {
        super(firstname, lastname);
        this.setFacultyNumber(facultyNumber);
    }

    void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() > 4 && facultyNumber.length() < 11) {
            this.facultyNumber = facultyNumber;
        } else{
            throw new IllegalArgumentException("Invalid faculty number!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Faculty number: %s%n", this.facultyNumber);
    }
}
