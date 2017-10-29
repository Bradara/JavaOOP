package FamilyTree;

import java.util.ArrayList;

class Person {
    private String firstName;
    private String lastName;
    private String birthday;
    private ArrayList<Person> parents;
    private ArrayList<Person> children;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Person> parents) {
        this.parents = parents;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }
}
