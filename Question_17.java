// Day = 10
// Question_17 = Check prime or not
public class Question_17 {
    public static void main(String[] args) {
        // int x=12;
        int x=7;
        Question_17.prime(x);
    }

    public static void prime(int x) {
		boolean flag=true;
		
		for(int i=2;i<x;i++) {
			if(x%i==0) 
			{
				flag=false;
				break;
				}
			
			}
		if(flag) {
			System.out.println(x+" is a prime");
		}
		else {
			System.out.println(x+" is not a prime");
		}
	}
}
