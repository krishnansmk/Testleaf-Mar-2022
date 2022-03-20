package week1.day1;

public class Identifyprime 
{
	boolean isFlag=false;
	public boolean isPrime(int p) 
	{
		if (p==1||p==2||p==3)
		{
			isFlag=true;
		}
		else
		{
			int iter=p/2;
			for (int i=2; i<=iter;i++)
			{
				int val=p%i;
				if (val==0)
				{
					isFlag=false;
					break;
				}
				isFlag=true;
			}
		}
		return isFlag;
	}
	
	public static void main(String[] args) 
	{
		int input=100;
		Identifyprime idp=new Identifyprime();
		if (idp.isPrime(input))
		{
			System.out.println(input+ " is a prime number");
		}
		else
		{
			System.out.println(input+ " is not a prime number");
		}
		
	}
}
