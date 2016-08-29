package Module2.Homework;

/**
 * Created by Жека on 27.08.2016.
 */
    public class Homework21 {


    static int Sum(int array[]) {
        int sum = 0;
        for (int i :array) {

                sum += i;

        }


        return sum;
    }
    static int Sum(double[] a) {
        int sum = 0;
        for (double i : a) {

            sum += i;

        }


        return sum;
    }


    public static void main(String[] args) {


        int[] array1= {1,12,3,2,5,6,1,2,8,10};
        double[] array2= {2.5,1.5,12.1,4.0,5.2,8.9,12.5,18.6,45.5,0.9};

        int sum = Sum(array1);
        double sum2=Sum(array2);

        System.out.println(sum);
        System.out.println(sum2);

    }


}





