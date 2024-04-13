package Lab_5.Task_2;

/*
Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee. 
A person has a name, address, phone number, and email address. A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. A faculty member has office hours and a rank. A staff member has a title. Override the toString() method in each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 */
class Person 
{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) 
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString() 
    {
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s", "Name", name, "Address", address, "Phone Number", phoneNumber, "Email Address", emailAddress);
    }
}

class Student extends Person 
{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) 
    {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public String toString() 
    {
        return String.format("%s%n%s: %s", super.toString(), "Class Status", classStatus);
    }
}

class Employee extends Person 
{
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, String dateHired) 
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() 
    {
        return String.format("%s%n%s: %s%n%s: %s%n%s: %s", super.toString(), "Office", office, "Salary", salary, "Date Hired", dateHired);
    }
}

class Faculty extends Employee 
{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() 
    {
        return String.format("%s%n%s: %s%n%s: %s", super.toString(), "Office Hours", officeHours, "Rank", rank);
    }
}

class Staff extends Employee 
{
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, String dateHired, String title) 
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String toString() 
    {
        return String.format("%s%n%s: %s", super.toString(), "Title", title);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Jane Smith", "456 Elm St", "555-5678", "jane@example.com", Student.SENIOR);
        Employee employee = new Employee("Alice Johnson", "789 Oak St", "555-9012", "alice@example.com", "Office 101", 50000, "2022-01-01");
        Faculty faculty = new Faculty("Bob Brown", "321 Pine St", "555-3456", "bob@example.com", "Office 202", 60000, "2021-01-01", "9am-5pm", "Professor");
        Staff staff = new Staff("Eva Green", "654 Cedar St", "555-7890", "eva@example.com", "Office 303", 40000, "2023-01-01", "Secretary");

        System.out.println("Person:");
        System.out.println(person);
        System.out.println("Student extends Person:");
        System.out.println(student);
        System.out.println("Employee extends Person:");
        System.out.println(employee);
        System.out.println("Faculty extends Employee:");
        System.out.println(faculty);
        System.out.println("Staff extends Employee:");
        System.out.println(staff);
    }
}
