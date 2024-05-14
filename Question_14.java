// Day = 7
// Question_14 = Shift Array By Choice

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[] ={1,2,3,4,5,6,7,8,9,10};
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("how many shift do you want");
		int numberOfShift=scan.nextInt();
		System.out.println("which shift do you want R/L ?");
		char directionOfShift=scan.next().charAt(0);
		
		if(directionOfShift=='R') {
			for(int i=1;i<=numberOfShift;i++) {
				int temp=arr[arr.length-1];
				for(int j=arr.length-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[0]=temp;
			}
		}
		else if(directionOfShift=='L') {
			for(int i=1;i<=numberOfShift;i++) {
				int temp=arr[0];
				for(int j=0;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=temp;
			}
		}
		else {
			System.out.println("invalid input");
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		scan.close();
	}
}
