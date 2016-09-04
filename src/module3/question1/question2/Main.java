package module3.question1.question2;

/**
 * Created by Жека on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Arithmetic sum = new Arithmetic();
        Adder checkInt = new Adder();


        System.out.println(sum.add(1,2));
        System.out.println(checkInt.check(3,4));
    }
}