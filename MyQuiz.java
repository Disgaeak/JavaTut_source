package ExceptionQuiz;

public class MyQuiz extends MyExtension
{
	
	public MyQuiz()
	{
		super(7);
	}
	
	public static void main(String[] args) 
	{
		MyExtension neExtense = new MyExtension(4);	
		try 
		{
			System.out.println("How many pokemon in party?");
		}
		catch(Exception e)
		{
			System.out.println("a party is 6 pokemon");
		}

	}
}