package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Input=20;
		int flag=0;
		
		if(Input == 0 || Input == 1) {
			System.out.println("It is as Prime Number");
		}
		else {
			for(int i=2; i<Input;i++) {
				
				int rem = Input%i;
				
				if(rem==0) {
					System.out.println("It is not a Prime Number");
					flag =1;
					break;
				}
				
			}
			
			if(flag ==0) {
				System.out.println("It is a Prime Number");
				
			}
			
		}
		
		

	}

}
