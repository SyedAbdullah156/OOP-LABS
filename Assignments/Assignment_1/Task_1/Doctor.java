package Assignments.Assignment_1.Task_1;

public abstract class Doctor extends TeamMember
{
    private String speciality;

    public Doctor(String name, String id, Gender gender, java.util.Date joinDate, String speciality)
    {
        super(name, id, gender, joinDate);
        this.speciality = speciality;    
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void checkPatientReport(Patient patient)
    {
        System.out.println("This report:" + patient.getReport() + "is checked by this doctor:" + super.getName());
    }  
}
