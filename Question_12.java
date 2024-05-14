// Question_12 = Array is sorted or not
public class Question_12 {
    public static void main(String[] args) {
        //		int arr[]= {4,5,2,8,69};//false
              int arr[]= {2,4,5,6,7,8};  //true
        //		int arr[]= {2,4,4,5,6,7,8};//true
                boolean isSorted=false;
                for(int i=0;i<arr.length-1;i++) {
                    if(arr[i]>arr[i+1]) {
                        System.out.println("not a sorted array");
                        isSorted=false;
                        break;
                    }
                    else {
                        isSorted=true;
                    }
                }
                
                if(isSorted==true) {
                    System.out.println("sorted array");
                }
                
        
        
            }
}
