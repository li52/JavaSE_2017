package java2017.javase.oop;

import com.sun.org.apache.bcel.internal.generic.NEW;
import java2017.javase.basic.ForTest;
import sun.reflect.generics.tree.IntSignature;

/**
 * Created by 李朋 on
 * 2017/3/28 0028 上午 9:07.
 */
public class _2Darray {
    public static void main(String[] args) {
        int [][] ints= new int[3][5];
        //System.out.println();
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <5 ; j++) {
                ints[i][j]=i+j;
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();

        }
        String[][]strings=new String[4][];
        strings[0]=new String[5];
        strings[1]=new String[1];
        strings[2]=new String[3];
        strings[3]=new String[4];
        for (int i = 0; i <strings.length ; i++) {
            for (int j = 0; j <strings[i].length ; j++) {
                System.out.print(strings[i]+"\t");
            }
            System.out.println();
        }


        double[][]doubles=
                {
                        {1d,2d,3d,4d,5d},
                        {1d},
                        {1d,2d,3d},
                        {1d,2d,3d,4d}
                };
        for (int i = 0; i <doubles.length ; i++) {
            for (int j = 0; j <doubles[i].length ; j++) {
                System.out.print(doubles[i]+"\t");

            }
            System.out.println();
        }
    }
}
