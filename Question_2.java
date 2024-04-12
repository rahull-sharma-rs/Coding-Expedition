// Question_2 = Write a Java program to remove a specific element from an array.

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={34,65,12,98,45,23,65};

        //let say we want to remove 65
        int value=scan.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                arr[i]=0;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        scan.close();
    }
}
