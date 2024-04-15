// Day = 4
// Question_7 = Write a Java program to add two matrices of the same size.

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] brr=new int[3][3];
        //taking input in arr

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("enter element in arr "+i+" index "+j);
                arr[i][j]=scan.nextInt();
            }
        }
//taking input in brr
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.println("enter element in brr "+i+" index "+j);
                brr[i][j]=scan.nextInt();
            }
        }
//adding both array and storing in result
        int[][] result=new int[3][3];
        System.out.println("result array");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("result array");
                result[i][j]=arr[i][j]+brr[i][j];
            }
        }
//printing element of result 2D array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(result[i][j]);
            }
        }
        scan.close();
    }
}
