package part2.lesson05.task01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int [] a=new int[] {1,2,3,4};
    for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
    /*a[0]=4;
    a[1]=3;
    a[2]=2;
    a[3]=1;
        System.out.println(Arrays.toString(a));*/
    for (int i= a.length-1;i>=0;i--)
        System.out.print(a[i]);
        //System.out.println(Arrays.toString(a));
        //System.out.print(a[i]);



    }
}




            /*for ( int i =0;i<a.length;i++){
                for (int j=0;j<a[i].length;j++)
*/
//for (int j=9;j<a[i].length;j--)
//System.out.println(Arrays.deepToString(a));
