// Question_10 = Write a Java program to segregate all 0s on the left side and all 1s on right side of a given array of 0s and 1s.

public class Question_10 {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,0,0,1};

        // using pointer approch

        int left=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
