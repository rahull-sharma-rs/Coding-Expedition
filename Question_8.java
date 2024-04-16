// Question_8 = Write a Java program to find a peak element which is not smaller than its neighbors
public class Question_8 {
    public static void main(String[] args) {
        int[] arr={9,2,4,5,3,8,4};
        //output should be 9,5,8
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
            else if(i==arr.length-1 && arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
            else if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
            
        }

    }
}
