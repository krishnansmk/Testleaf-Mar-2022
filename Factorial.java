package week1.day1;

public class Factorial
{
	public static void main(String[] args) 
	{
		int range=5;
		int fact=1;
		System.out.print(range);
		for (int i=1;i<=range;i++)
		{
			fact=i*fact;
			if (range>i)
			{
				System.out.print("*"+(range-i));
			}
		}
		System.out.print("="+fact);
	}
}
