package Assignment1;

public class OddOrEven {
	public void bool(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	public static void main(String[] args)
	{
		int num=26;
		OddOrEven game=new OddOrEven();
		game.bool(num);
	}
}
