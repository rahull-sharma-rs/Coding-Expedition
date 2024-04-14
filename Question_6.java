// Question_6 = Write a Java program to find all combinations of four elements of a given array whose sum is equal to a given value

import java.util.ArrayList;
import java.util.List;

public class Question_6 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,1,2};
        int targetSum = 53;

        List<List<Integer>> combination=new ArrayList<>();
        
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
            int left=j+1;
            int right=arr.length-1;
            while (left<right) {
                List<Integer> c=new ArrayList<>();
                int sum=arr[i]+arr[j]+arr[left]+arr[right];
                if(targetSum==sum){
                    c.add(i);
                    c.add(j);
                    c.add(arr[left]);
                    c.add(arr[right]);
                    combination.add(c);
                    left++;
                    right--;
                }
                else if(sum<targetSum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        }

        if(combination.isEmpty()){
            System.out.println("NO combinataion found ");
        }else {
            System.out.println("Combinations with sum equal to " + targetSum + ":");
            for (List<Integer> c : combination) {
                System.out.println(c);
            }
        }
    }
}
