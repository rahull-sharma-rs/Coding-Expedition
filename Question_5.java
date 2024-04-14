// Day = 3
// Question_5 = 23.	Write a Java program to find the smallest and second smallest elements of a given array.

public class Question_5 {

    public static void main(String[] args) {
        
    int[] arr={43,54,12,65,23};

    int smallest=arr[0];
    int secondSmallest=arr[0];

    for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
          
            secondSmallest=smallest;
            smallest=arr[i];
        }else if(arr[i]<secondSmallest && arr[i]!= smallest){
            secondSmallest=arr[i];
        }
    }
    System.out.println("Smallest = "+smallest);
    System.out.println("Second smallest = "+secondSmallest);

}
    
}
