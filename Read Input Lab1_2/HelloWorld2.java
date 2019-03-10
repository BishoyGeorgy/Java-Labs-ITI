public class HelloWorld2 {
	public static void main (String args[])
	{
		if (args.length==1)
			System.out.println("Hello World" + args[0]);
		else
			System.out.println("Enter a valid Input");
	}
}