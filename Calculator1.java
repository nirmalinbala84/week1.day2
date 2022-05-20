package firstproject;

public class Calculator1 {
	public int add(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		return sum;
	}
	public int sub(int num1,int num2)
	{
		int diff=num1-num2;
		return diff;
	}
	public double mul(double num1,double num2)
	{
		double prod=num1*num2;
		return prod;
	}
	public double div(double num1,double num2)
	{
		double quo=num1/num2;
		return quo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 cal1=new Calculator1();
		System.out.println("The sum of two numbers is" +cal1.add(2, 2,7));
		System.out.println("The diff of two numbers is" +cal1.sub(13, 2));
		System.out.println("The prod of two numbers is" +cal1.mul(13, 2));
		System.out.println("The division of two numbers is" +cal1.div(13, 2));

	}

}
