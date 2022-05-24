package week1.day2;

public class CalculatorNew {
	
	int num1;
	int num2;
	int num3;
	public int add(int num1,int num2,int num3) {
		int rem= num1+num2+num3;
		return rem;
	}
	
	public int sub(int num1, int num2) {
		int rem=num1-num2;
		return rem;
		
	}
	
	public  double mult(double num1,double num2) {
		  
		double rem=num1*num2;
		System.out.println(rem);
		return rem;
	}
	
	public float divide(float num1,float num2) {
		
		float rem =num1/num2;
		return rem;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalculatorNew obj= new CalculatorNew();
		
		System.out.println("Additon :"+ obj.add(20,10,5));
		
		System.out.println("Subraction :"+obj.mult(4, 2));
		
		System.out.println("Multiplication :"+obj.mult(10, 5));
		
		System.out.println("Divide :"+obj.divide(25,5));
	}

}
