package Coolledge.Tech;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Random;
import java.lang.*;
/**
 * Created by Жека on 11.10.2016.
 */
public class Hedgehog {
    public static void main(String[] args) {
        Random rnd=new Random() ;
        int[][]a=new int[3][3];
        for (int i=0;i<3;i++){

            for (int j=0;j<3;j++) {
                 a[i][j]  =(int)(Math.random()*10 );
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }
}
