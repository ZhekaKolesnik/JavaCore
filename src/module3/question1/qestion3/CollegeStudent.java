package module3.question1.qestion3;

/**
 * Created by Жека on 05.09.2016.
 */
public class CollegeStudent extends Student {
    protected String collegeName;
    protected int rating;
    protected long id;


    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    private String getCollegeName() {
        return collegeName;
    }

    private void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    private int getRating() {
        return rating;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    private long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }
}