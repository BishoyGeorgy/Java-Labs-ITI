package quadpackage;
import java.util.function.Consumer;
public class QuadraticEq
{
	public static void main(String args [])
	{
		if(args.length!=3)
			System.out.println("Please enter 3 valid number");

		else
		{
			Double arr [] = {Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2])};
			Double root;
			Consumer<Double[]> d = (r) ->
			{
				double a = r[0];
				double b = r[1];
				double c = r[2];
				double det = (b*b-4*a*c);
				if (det==0)
					System.out.println("root = "+(-1*b/(2*a)));
				else if (det>0)
				{
					System.out.println("root = "+((-1*b+Math.sqrt(det))/(2*a)));
					System.out.println("root = "+((-1*b-Math.sqrt(det))/(2*a)));
				}
				else
				{
					System.out.println("root = "+(-1*b)/(2*a) + " +i " +(Math.sqrt(-1*det))/(2*a));
					System.out.println("root = "+(-1*b)/(2*a) + " -i " +(Math.sqrt(-1*det))/(2*a));
				}
			};
			d.accept(arr);			
			
		}
	}
}