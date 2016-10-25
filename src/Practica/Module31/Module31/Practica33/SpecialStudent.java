package Practica.Module31.Module31.Practica33;

/**
 * Created by Жека on 18.10.2016.
 */
public class SpecialStudent extends CoollegeStudent{
    protected long secretKey;
    protected String email;
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }



    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public SpecialStudent(Course[] courseTaken, String lastName, long secretKey) {
        super(courseTaken, lastName);
        this.secretKey = secretKey;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private long getSecretKey() {
        return secretKey;
    }

    private void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }
}
