package week1.day1;

public class Fibseries 
{
	public static void main(String[] args) 
	{
		byte range = 10;
		int firstNum=0,secNum=1,totVal=0;
		System.out.print(firstNum+",");
		
		for (int i=1; i<=(range-1); i++)
		{
			System.out.print(secNum+",");
			totVal=firstNum+secNum;
			firstNum=secNum;
			secNum=totVal;
		}
	}
}
