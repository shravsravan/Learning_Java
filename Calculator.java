package Assignment1;

public class Calculator {
	public int add(int num1,int num2) {
		int num3;
		num3=num1+num2;
		System.out.println(num3);
		return num3;
	}
	public int mul(int num1,int num2)
	{
		int num3;
		num3=num1*num2;
		System.out.println(num3);
		return num3;
	}
	public float div(float num1,float num2)
	{
		float num3;
		num3=num1/num2;
		System.out.println(num3);
		return num3;
	}
	public int sub(int num1,int num2)
	{
		int num3;
		num3=num1-num2;
		System.out.println(num3);
		return num3;
	}
	public static void main(String[] args)
	{
		int num1=10;
		int num2=40;
		Calculator game=new Calculator();
		game.add(num1,num2);
		game.mul(num1,num2);
		game.div(num1,num2);
		game.sub(num1,num2);
	}

}
