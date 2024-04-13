// Day=1
// Question_1= Write a Java program to print all elements of a given array(Reverse).


public class Question_1 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--; 
            
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}