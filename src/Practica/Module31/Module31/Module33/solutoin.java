package Practica.Module31.Module31.Module33;

/**
 * Created by Жека on 20.09.2016.
 */
public class solutoin {
    public static void main(String[] args) {
        Bird bird = new Bird();
Animal animal= new Animal();

        bird.fly();
        bird.ebird();
        bird.walk();
        bird.sign();
    }

    /**
     * Created by Жека on 20.09.2016.
     */
    public static class Bird extends Animal {
        protected void ebird() {
            System.out.println(" i am bird");

        }
        protected void fly() {
            System.out.println("i am fluing");
        }
        protected void sign (){
            System.out.println("i am signing");
        }



    }

    /**
     * Created by Жека on 20.09.2016.
     */
    public static class Animal {
       protected void  walk (){System.out.println("I am wolking");}

    }
}
