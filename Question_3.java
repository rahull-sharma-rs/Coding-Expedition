// Day=2
//Question_2 = Write a Java program to find the maximum and minimum value of an array.

public class Question_3 {
    public static void main(String[] args) {
        int[] arr={34,76,23,98,37,89};

        //brute force solution 
        // Sort the array
        //Arrays.sort(array);
         // The minimum value is the first element in the sorted array
        //int min = array[0];
        // The maximum value is the last element in the sorted array
        //int max = array[array.length - 1];

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min) {
                min=arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);


    }
}
