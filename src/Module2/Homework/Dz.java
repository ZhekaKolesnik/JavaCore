package Module2.Homework;

/**
 * Created by Жека on 31.08.2016.
 */
public class Dz {
    /**
     * Created by Жека on 27.08.2016.
     */
        public static class Homework21 {


        static int Sum(int array[]) {
            int sum = 0;
            for (int i :array) {

                    sum += i;

            }


            return sum;
        }
        static double Sum(double array[] ) {
            double sum = 0;
            for (double i : array) {

                sum += i;

            }


            return sum;
        }
        static int min(int[]array){

            int min=0;

            for( int i = 0;i<array.length;i++)
            {
                if (min >array[i]){
                    min = array[i];
                }

            }
            return min;
        }
        static double min(double[]array){

            double min=0;

            for( int i = 0;i<array.length;i++)
            {
                if (min >array[i]){
                    min = array[i];
                }

            }
            return min;
        }
        static int max(int[]array){

            int max=0;

            for( int i = 0;i<array.length;i++)
            {
                if (max <array[i]){
                    max = array[i];
                }

            }
            return max;
        }
        static double max(double[]array){

            double max=0;

            for( int i = 0;i<array.length;i++)
            {
                if (max <array[i]){
                    max = array[i];
                }

            }
            return max;
        }
        static int maxPositive(int[]array){

            int max=0;

            for( int i = 0;i<array.length;i++)
            {
                if (max <array[i]&&array[i]>0){
                    max = array[i];
                }

            }
            return max;
        }
        static double maxPositive(double[]array){

            double max=0;

            for( int i = 0;i<array.length;i++)
            {
                if (max <array[i]&&array[i]>0){
                    max = array[i];
                }

            }
            return max;
        }
        static int multiplication(int array[]) {

            int mult=1;

            for( int i = 0;i<array.length;i++)
            {
                mult=mult*array[i] ;
            }
            return mult;
        }
        static double multiplication(double  array[]){

            double mult=1;

            for( int i = 0;i<array.length;i++)
            {
              mult=mult*array[i] ;
            }
            return mult;
        }
        static int modulus(int  array[]){

            int mod=array[0];

            for( int i = 0;i<array.length;i++)
            {
                mod=array[0]%array.length;
            }
            return mod;
        }
        static double modulus(double  array[]){

            double mod=array[0];

            for( int i = 0;i<array.length;i++)
            {
               mod=array[0]%array.length;
            }
            return mod;
        }
        static int secondLargest(int[]array){
            int max=0;
            int secondLargest=array[0];

            for( int i = 0;i<array.length;i++)
            {

                if (max <array[i]) {

                    max = array[i];


                }

                if (secondLargest<array[i]&&array[i]<max)
                {
                    secondLargest=array[i];
                }


            }
            return secondLargest;
        }
        static double secondLargest(double[]array){
            double max=0;
            double secondLargest=array[0];

            for( int i = 0;i<array.length;i++)
            {

                if (max <array[i]) {

                    max = array[i];


                }

                if (secondLargest<array[i]&&array[i]<max)
                {
                    secondLargest=array[i];
                }


            }
            return secondLargest;
        }




        public static void main(String[] args) {


            int[] array1= {1,12,3,2,-5,6,1,2,8,10};
            double[] array2= {2.5,1.5,-12.1,4.8,5.2,8.9,12.5,-18.6,45.5,44.3};



            int sum = Sum(array1);
            double sum2=Sum(array2);
            int min=min(array1);
            double min2=min(array2);
            int max=max(array1);
            double max2=max(array2);
            int maxpositive=maxPositive(array1);
            double maxpositive2=maxPositive(array2);
            int multiplication=multiplication(array1);
            double multiplication2=multiplication(array2);
            int modulus=modulus(array1);
            double modulus2=modulus(array2);
            int secondLargest=secondLargest(array1);
            double secondLargest2=secondLargest(array2);

            System.out.println("int sum = "+sum);
            System.out.println("double sum= "+sum2);
            System.out.println("int minimum= "+min);
            System.out.println("double minimum= "+min2);
            System.out.println("int maximym= "+max);
            System.out.println("double maximym= "+max2);
            System.out.println("int maximym posistive= "+maxpositive);
            System.out.println("double maximym posistive= "+maxpositive2);
            System.out.println("int multiplication= "+multiplication);
            System.out.println("double multiplication= "+multiplication2);
            System.out.println("int modulus= "+modulus);
            System.out.println("double modulus= "+modulus2);
            System.out.println("int secondLargest = "+secondLargest);
            System.out.println("double secondLargest = "+secondLargest2);
        }


    }
}
