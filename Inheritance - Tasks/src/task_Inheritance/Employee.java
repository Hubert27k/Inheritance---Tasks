package task_Inheritance;

public class Employee extends Person {
    protected String position;
    protected String companynName;

    public Employee(String name, String lastName, String position, String companynName) {
        super(name, lastName);
        this.position = position;
        this.companynName = companynName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println( " and I work for the company " + companynName + " as " + position);
    }
}
