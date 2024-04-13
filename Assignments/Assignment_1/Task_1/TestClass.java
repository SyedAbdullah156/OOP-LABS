package Assignments.Assignment_1.Task_1;
import java.util.ArrayList;
import java.util.Date;
public class TestClass 
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        // Array of Patients
        ArrayList<Patient> totalPatients = new ArrayList<>();

        // Add patients to the list
        totalPatients.add(new Patient("John Doe", new Date(80, 0, 1), Gender.MALE, new Date(124, 2, 31), "Report 1"));
        totalPatients.add(new Patient("Jane Smith", new Date(90, 4, 15), Gender.FEMALE, new Date(124, 3, 2), "Report 2"));
        totalPatients.add(new Patient("Michael Johnson", new Date(75, 2, 10), Gender.MALE, new Date(124, 0, 20), "Report 3"));
        totalPatients.add(new Patient("Emily Brown", new Date(85, 7, 25), Gender.FEMALE, new Date(124, 4, 10), "Report 4"));
        totalPatients.add(new Patient("William Wilson", new Date(88, 10, 5), Gender.MALE, new Date(124, 6, 15), "Report 5"));
        totalPatients.add(new Patient("Jessica Taylor", new Date(95, 11, 20), Gender.FEMALE, new Date(124, 8, 5), "Report 6"));

        // Array of TeamMembers
        ArrayList<TeamMember> totalTeamMembers = new ArrayList<>();

        // Add instances of Doctor to the ArrayList
        totalTeamMembers.add(new SeniorDoctor("Jane Smith", "D002", Gender.FEMALE, new Date(90, 4, 15), "Pediatrics", totalPatients));
        totalTeamMembers.add(new InternDoctor("John Doe", "D001", Gender.MALE, new Date(90, 4, 15), "Cardiology", totalTeamMembers.get(0)));
        totalTeamMembers.add(new Surgeon("Michael Johnson", "D003", Gender.MALE, new Date(90, 4, 15), "Neurology", totalPatients));

        // Array of Departments
        ArrayList<Department> totalDepartments = new ArrayList<>();

        // Add depatments to the list
        ArrayList<Patient> deptarment0Patients = new ArrayList<>();
        deptarment0Patients.add(totalPatients.get(0));
        deptarment0Patients.add(totalPatients.get(1));
        totalDepartments.add(new Department("Heart", deptarment0Patients, totalTeamMembers));

        ArrayList<Patient> deptarment1Patients = new ArrayList<>();
        deptarment1Patients.add(totalPatients.get(2));
        deptarment1Patients.add(totalPatients.get(3));
        totalDepartments.add(new Department("Lungs", deptarment1Patients, totalTeamMembers));
        
        ArrayList<Patient> deptarment2Patients = new ArrayList<>();
        deptarment2Patients.add(totalPatients.get(4));
        deptarment2Patients.add(totalPatients.get(5));
        totalDepartments.add(new Department("Eye", deptarment2Patients, totalTeamMembers));

        // Hospital
        Hospital myHospital = new Hospital("Abdullah's Hospital", "Bahria Town Lahore", totalPatients, totalDepartments);

        // Print the list of patients in the hospital
        System.out.println("\nPatients in the hospital:");
        ArrayList<Patient> patients = myHospital.getPatients();
        for (Patient patient : patients) 
        {
            System.out.println("Name: " + patient.getName());
            System.out.println("Gender: " + patient.getGender());
            System.out.println("Birth Date: " + patient.getBirthDate());
            System.out.println("Admission Date: " + patient.getAdmissionDate());
            System.out.println("Report: " + patient.getReport());
            System.out.println();
        }

        // Print the list of departments in the hospital
        System.out.println("Departments in the hospital:");
        ArrayList<Department> departments = myHospital.getDepartments();
        for (Department department : departments) 
        {
            System.out.println("Department Name: " + department.getName());
            System.out.println("Patients in the department:");
            ArrayList<Patient> departmentPatients = department.getPatients();
            for (Patient patient : departmentPatients) 
            {
                System.out.println("Name: " + patient.getName());
                System.out.println("Gender: " + patient.getGender());
                System.out.println("Birth Date: " + patient.getBirthDate());
                System.out.println("Admission Date: " + patient.getAdmissionDate());
                System.out.println("Report: " + patient.getReport());
                System.out.println();
            }
        }
    }
}
