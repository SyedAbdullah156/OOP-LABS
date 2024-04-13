package Assignments.Assignment_1.Task_1;

public class InternDoctor extends Doctor
{
    private SeniorDoctor supervisor;

    public InternDoctor(String name, String id, Gender gender, java.util.Date joinDate, String speciality, TeamMember supervisor)
    {
        super(name, id, gender, joinDate, speciality);
        this.supervisor = (SeniorDoctor)supervisor;
    }
    
    @Override
    public void treatPatient(Patient patient)
    {
        System.out.println("This Patient: " + patient + "is treated by this intern doctor:" + InternDoctor.super.getName());
    }

    public SeniorDoctor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(SeniorDoctor supervisor) {
        this.supervisor = supervisor;
    }
}
