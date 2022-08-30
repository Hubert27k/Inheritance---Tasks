package task_Inheritance;

public class Person {
    protected String name;
    protected String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void introduce() {
        System.out.printf("I'm " + name + " " + lastName);
    }
}
