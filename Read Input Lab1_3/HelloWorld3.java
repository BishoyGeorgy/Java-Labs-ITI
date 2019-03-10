public class HelloWorld3 {
	public static void main (String args[])
	{
		if (args.length==2)
		{
			int count=Integer.parseInt(args[0]);
			for(int i=0;i<count;i++)
				System.out.println(args[1]);
		}
		else
			System.out.println("Enter a valid Input");
	}
}