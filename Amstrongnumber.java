package week1.day2;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int output=0;
		
		int input=153;
		
		int orgNumber = input;

		while (input >0) {
			
			int M = input % 10;
			
			output= output+(M*M*M);
		
	    	 input = input /10;
		}
		
	
		System.out.println("My Amstrong Number is :"+output);
	    
	    if(orgNumber == output) {
	    	
	    	System.out.println("It is an Amstrong Number");
	    }
	    else {
	    	
	    	System.out.println("NOt an Amstrong Number");
	    	
	    	
	    }
	    
	    
	    }
	}
	


