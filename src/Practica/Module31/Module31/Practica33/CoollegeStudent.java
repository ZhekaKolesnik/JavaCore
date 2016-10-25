package Practica.Module31.Module31.Practica33;

/**
 * Created by Жека on 18.10.2016.
 */
public class CoollegeStudent extends Student {
    protected String collegeName;
    protected int rating;
    protected long id;

    public CoollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CoollegeStudent(Course[] courseTaken, String lastName) {
        super(courseTaken, lastName);
    }

    public CoollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    private String getCollegeName() {
        return collegeName;
    }

    private  void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    private  int getRating() {
        return rating;
    }


    private  void setRating(int rating) {
        this.rating = rating;
    }

    private  long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }
}
