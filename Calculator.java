package week1.day2;

public class Calculator {
	
	int x;
	int y;
	int z;
	
	public static int Addition(int x,int y) {
		
		int z=x+y;
		return z;
	}
	public int Subraction(int x, int y) {
		
		int z =x-y;
		return z;
	}
    public int Multiplication(int x, int y) {
		
		int z =x*y;
		return z;
	}
    public int Dividition(int x, int y) {
	
	int z =x/y;
	return z;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		
		int Sum= obj.Addition(12, 10);
		System.out.println("Adddition of Two Values :"+ Sum);
		 int Sub= obj.Subraction(20, 10);
		System.out.println("Subraction of Two Values :"+ Sub);
		int Mult= obj.Subraction(20, 10);
		System.out.println("Multiply of Two Values :"+ Mult);
		int Div=obj.Dividition(10, 5);
		System.out.println("Divide of Two Values :"+ Div);
	}

}
