package Mankind;

public class Human {
    protected String firstname;
    protected String lastname;

    Human(){}

    Human(String firstname, String lastname) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
    }

    void setFirstname(String firstname) {

        if (Character.isLowerCase(firstname.charAt(0))) {
            throw new IllegalArgumentException(String.format("Expected upper case letter!Argument: firstName%n"));
        } else if (firstname.length() < 4) {
            throw new IllegalArgumentException(String.format("Expected length at least 4 symbols!Argument: firstName%n"));
        } else {
            this.firstname = firstname;
        }
    }

    void setLastname(String lastname) {
        if (Character.isLowerCase(lastname.charAt(0))) {
            throw new IllegalArgumentException(String.format("Expected upper case letter!Argument: lastName%n"));
        } else if (lastname.length() < 3) {
            throw new IllegalArgumentException(String.format("Expected length at least 3 symbols!Argument: lastName%n"));
        } else {
            this.lastname = lastname;
        }
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%n", this.firstname, this.lastname);
    }
}
