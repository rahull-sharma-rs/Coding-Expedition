//Question_4 = Write a Java program to find the duplicate values & occurrence of an integer array .

public class Question_4 {
    public static void main(String[] args) {
        int[] arr={2,4,6,1,8,5,9,5,1};
        //output Should be = duplicate =1,5 and occurrence 1 = 2 times, occurrence 5 = 2 times
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count>1){
                System.out.println("duplicate = "+arr[i]);
                System.out.println("occurrence = "+count);
            }
        }
        
    }
}
