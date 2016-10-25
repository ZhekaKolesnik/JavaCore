package Practica.Module31.Module31.Practica33;

import java.util.Date;

/**
 * Created by Жека on 18.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Date date=new Date();
        Course object1=new Course(date,"Name1");
        Course object2=new Course(date,"Name2");
        Course object3 = new Course(date,"Name3");
        Course object4 = new Course(date,"Name 4");
        Course object5 = new Course(date,"Name 5");
        Course[] array ={object1,object2,object3,object4,object5};
        Student object6 = new Student("Lexa","Kisloy",12);
        Student object7=new Student(array,"pz8");
        CoollegeStudent object8=new CoollegeStudent("mixa","kiki",13);
        CoollegeStudent object9=new CoollegeStudent(array,"oor");
        CoollegeStudent object10=new CoollegeStudent("reno","Lilaryk",11,"kook",45,8);
        SpecialStudent object11=new SpecialStudent("Nemo","Kio",12);
        SpecialStudent object12=new SpecialStudent("Hoi","koiu",12,121212);
        SpecialStudent object13=new SpecialStudent(array,"goot",2323);

    }
}
