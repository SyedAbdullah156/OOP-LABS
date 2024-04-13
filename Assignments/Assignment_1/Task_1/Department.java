package Assignments.Assignment_1.Task_1;
import java.util.ArrayList;

public class Department 
{
    private String name;
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    private ArrayList<TeamMember> teamMembers = new ArrayList<TeamMember>();

    public Department(String name, ArrayList<Patient> patients, ArrayList<TeamMember> teamMembers)
    {
        this.name = name;
        this.patients = patients;
        this.teamMembers = teamMembers;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void removePatient(Patient patient)
    {
        patients.remove(patient);
    }

    public void addPatient(Patient patient) 
    {
        patients.add(patient);
    }

    public void addTeamMember(TeamMember teamMember) 
    {
        teamMembers.add(teamMember);
    }

    public void removeTeamMember(TeamMember teamMember) 
    {
        teamMembers.remove(teamMember);
    }

    public ArrayList<Patient> getPatients() 
    {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) 
    {
        this.patients = patients;
    }

    public ArrayList<TeamMember> getTeamMembers() 
    {
        return teamMembers;
    }

    public void setTeamMembers(ArrayList<TeamMember> teamMembers) 
    {
        this.teamMembers = teamMembers;
    }

    
}
