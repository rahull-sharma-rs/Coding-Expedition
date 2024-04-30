// day = 8
// Question_15 = Max Subarray Sum

public class Question_15 {
    public static void main(String[] args) {
        
    
    int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		
    int maxi=0;
    
    //brute force solution
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i;j<arr.length;j++) {
//				int sum=0;
//				for(int k=i;k<=j;k++) {
//					sum=sum+arr[k];
//				}
//				maxi=Math.max(maxi, sum);
//			}
//		}
    //better solution
    for(int i=0;i<arr.length;i++) {
        int sum=0;
        for(int j=i;j<arr.length;j++) {
            
            
            sum=sum+arr[j];
            maxi=Math.max(maxi, sum);

        }
    }
    System.out.println(maxi);
}
}


