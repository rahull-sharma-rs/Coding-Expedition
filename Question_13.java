// Question_13 = WAP to find Majority Element That Occurs More Than N/2 Times

public class Question_13 {
    public static void main(String[] args) {
		int[] arr= {2,2,1,1,2,2};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count>(arr.length/2)) {
				System.out.print(arr[i]);
				break;
			}
		}
	}
}
