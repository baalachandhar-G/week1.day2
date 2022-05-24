package week1.day2;

public class PraticeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int[] array1= {22,23,24,25,26,27,28};
		
		int[] array2= {1,2,3,20,25,21,20,23};
		
		int length1= array1.length;
		
		int length2=array2.length;
		
		for (int i = 0; i < length1; i++) {
			
			for (int j = 0; j < length2; j++) {
				
				if(array1[i]== array2[j]) {
					
					System.out.println(array2[j]);
					
				}
				
			}
		}
	}

}
