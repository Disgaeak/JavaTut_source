package ExceptionQuiz;

public class MyExtension
{
	public MyExtension(int value)
	{
		if(value > 6)
			throw new ArithmeticException("no more than 6 is allowed");
		else
			System.out.println("party is allowed");
	}
	
}
