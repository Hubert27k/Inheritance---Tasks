import task_Inheritance.Employee;

public class InheritanceTasks {
    public static void main(String[] args){
        /*
        Create a new class "Employee" to follow the class "Person" and then:

        - add new fields to the "Employee" class: position and company name

        - add a constructor who will set the name, surname, position, company name

        - use the parent class constructor for the first and last name

        - override the method "introduce ()" to write to the screen
        "I am <name> <surname> and I work for the company <company name> on <position>"
           eg "I'm Hubert Kwiatkowski and I work for the company KIDA as programmer"

        - complete the fields, methods, constructions in classes "Person" and "Employee" with appropriate access modifiers

        - test the Employee class in the main group creating and creating "introduce ()"
         */
        Employee employee = new Employee("Hubert", "Kwiatkowski","programmer","KIDA");
        employee.introduce();
    }
}
