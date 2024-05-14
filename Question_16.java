// Day = 9
// Question_16 = Bubble Sort 

public class Question_16 {
    public static void main(String[] args) {
		int[] arr= {32,43,21,54,3};
		for(int i=0;i<arr.length;i++) {
			boolean isSwapped=false;

			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false) {
				break;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
