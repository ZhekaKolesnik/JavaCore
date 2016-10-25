package Courses.Module1.EnterKode;

import Coolledge.oop.Father;

/**
 * Created by Жека on 20.09.2016.
 */
public class Main {
    public static void draw(figure figure){
        figure.drawFigure();
    }


    public static void main(String[] args) {
        String[] phones = {"android", "Apple"};
        User user = new User();
        user.setPhones(phones);
        figure kvad = new kvad();
        figure rectangle= new rectangle();
        draw(kvad);

    }

}
