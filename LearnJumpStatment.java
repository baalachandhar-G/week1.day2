package week1.day2;

import java.util.Iterator;

public class LearnJumpStatment {
	
	
	public static void main (String[] arg) {
		
		for(int i=0; i<=10;i++) {
			
			if(i==5) {
				System.out.println("Five");
		        break;
				//continue;
		}
			
			System.out.println(i);
		}
		
		System.out.println("End of the Progrem");
	}
	

}
