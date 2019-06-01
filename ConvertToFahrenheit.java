import java.util.function.Function;
public class ConvertToFahrenheit
{
	public static void main(String args [])
	{
		if(args.length!=1)
			System.out.println("Please enter a valid number");

		else
		{
			double cel=Double.parseDouble(args[0]);
			Function<Double,Double> a = (r)->(r*1.8)+32;
			System.out.println(a.apply(cel));
			
		}		
		
	}
}