public class SearchForWord
{
	public static void main(String args[])
	{
		
		if(args.length!=2)
			System.out.println("Enter a Paragraph and a word to search");
		else
		{
			String restOfParagraph=args[0];
			String word=args[1];
			int counter=0;
			String arr[]=restOfParagraph.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				if (arr[i].equals(word))
					counter++;
			
			}
			if (counter!=0)
				System.out.println(counter);
			else
				System.out.println("Not Found");
		}
	}

}