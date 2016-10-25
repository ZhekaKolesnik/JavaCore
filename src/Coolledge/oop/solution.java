package Coolledge.oop;

/**
 * Created by Жека on 19.09.2016.
 */
public class solution {
    static Father father = new Father();
    static Mother mother= new Mother();
    public static void main(String[] args) {
        Father.age=12;
        Father.dick=20;
        Mother.hight=40;
        Mother.name="female";

        System.out.println(mother);


    }
}
