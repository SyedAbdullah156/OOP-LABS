package Assignments.Assignment_1.Task_1;

public class Patient 
{
    private String name;
    private java.util.Date birthDate;
    private Gender gender;
    private java.util.Date admissionDate;
    private String report;

    public Patient(String name, java.util.Date birthDate, Gender gender, java.util.Date admissionDate, String report)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.admissionDate = admissionDate;
        this.report = report;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public java.util.Date getBirthDate() 
    {
        return birthDate;
    }

    public void setBirthDate(java.util.Date birthDate) 
    {
        this.birthDate = birthDate;
    }

    public Gender getGender() 
    {
        return gender;
    }

    public void setGender(Gender gender) 
    {
        this.gender = gender;
    }

    public java.util.Date getAdmissionDate() 
    {
        return admissionDate;
    }

    public void setAdmissionDate(java.util.Date admissionDate) 
    {
        this.admissionDate = admissionDate;
    }

    public String getReport() 
    {
        return report;
    }

    public void setReport(String report) 
    {
        this.report = report;
    }
}
