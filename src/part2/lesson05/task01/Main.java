package part2.lesson05.task01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        toleft();
    }


        private static void toleft() {

            int[][] a = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
            for(int i = a.length-1;i>=0;i--){
                for (int j=a[i].length-1;j>=0;j--)
                System.out.print(""+a[i][j] + "\t");
                System.out.println();



            }
        }
    }

            /*for ( int i =0;i<a.length;i++){
                for (int j=0;j<a[i].length;j++)
*/
//for (int j=9;j<a[i].length;j--)
//System.out.println(Arrays.deepToString(a));
