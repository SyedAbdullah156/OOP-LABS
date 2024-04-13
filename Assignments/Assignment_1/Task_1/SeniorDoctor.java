package Assignments.Assignment_1.Task_1;
import java.util.ArrayList;

public class SeniorDoctor extends Doctor
{
    @SuppressWarnings("unused")
    private ArrayList<Patient> patients = new ArrayList<>();

    public SeniorDoctor(String name, String id, Gender gender, java.util.Date joinDate, String speciality, ArrayList<Patient> patients)
    {
        super(name, id, gender, joinDate, speciality);
        this.patients = patients;
    }

    @Override
    public void treatPatient(Patient patient)
    {
        System.out.println("This Patient: " + patient + "is treated by this Senior doctor:" + SeniorDoctor.super.getName());
    }
}
