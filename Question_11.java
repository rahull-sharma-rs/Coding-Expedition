//Day = 6
//Question_11 = Rotate Array by one (Left side)


import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter ther size of array");
		
		int[] arr=new int[scan.nextInt()];
		System.out.println("enter the data in array");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the data in element ="+(i+1));
			arr[i]=scan.nextInt();
		}
		
		leftShifting(arr);
		
		
		scan.close();
	}


    public static void leftShifting(int[] arr) {
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;

        System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("]");

	}
}
