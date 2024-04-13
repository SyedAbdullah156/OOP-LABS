package Assignments.Assignment_1.Task_1;
import java.util.ArrayList;

public class Hospital 
{
    private String name;
    private String address;
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private ArrayList<Department> departments = new ArrayList<Department>();

    public Hospital(String name, String address, ArrayList<Patient> patients, ArrayList<Department> departments)
    {
        this.name = name;
        this.address = address;
        this.patients = patients;
        this.departments = departments;
    } 

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public ArrayList<Patient> getPatients() 
    {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) 
    {
        this.patients = patients;
    }

    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    public void removePatient(Patient patient)
    {
        patients.remove(patient);
    }
    
    public ArrayList<Department> getDepartments() 
    {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) 
    {
        this.departments = departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public void removeDepartment(Department department)
    {
        departments.remove(department);
    }
}
