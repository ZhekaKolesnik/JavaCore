package Practica.Module31.Module31.Practica33;

/**
 * Created by Жека on 18.10.2016.
 */
public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected Course[] courseTaken;

    protected int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.group = group;
    }

    public Student(Course[] courseTaken, String lastName) {
        this.courseTaken = courseTaken;
        this.lastName = lastName;
    }

    private String getFirstName() {
        return firstName;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getGroup() {
        return group;
    }

    private void setGroup(int group) {
        this.group = group;
    }

    private Course[] getCourseTaken() {
        return courseTaken;
    }

    private void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
