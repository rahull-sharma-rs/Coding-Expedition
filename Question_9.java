// day = 5
// Question_9 = Write a Java program to arrange the elements of a given array of integers where all negative integers appear before all the positive integers.
public class Question_9 {

    public static void main(String[] args) {
        
    
    int[] arr={-2,5,7,-4,6,-8,5};
    int left=0;
    int right=arr.length-1;

    while(left<right){

        while (left<=right && arr[left]<0) {
            left++;
        }
        while (left<=right && arr[right]>=0) {
            right--;
        }

        if (left<=right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }



    }

    for(int i:arr){
        System.err.print(i+" ");
    }

}

}
