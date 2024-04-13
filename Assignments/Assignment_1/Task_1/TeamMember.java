package Assignments.Assignment_1.Task_1;

public abstract class TeamMember 
{
    private String name;
    private String id;
    private Gender gender;
    private java.util.Date joinDate;
    @SuppressWarnings("unused")
    private static final int maxWorkHours = 12;

    public TeamMember(String name, String id, Gender gender, java.util.Date joinDate)
    {
        this.name= name;
        this.id = id;
        this.gender = gender;
        this.joinDate = joinDate;
    }

    public abstract void treatPatient(Patient patient);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public java.util.Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(java.util.Date joinDate) {
        this.joinDate = joinDate;
    }
}
