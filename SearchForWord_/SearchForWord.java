public class SearchForWord
{
	public static void main(String args [])
	{
		String restOfParagraph=args[0];
		int indexOfWord;
		int counter =0;
		if (args.length!=2)
			System.out.println("Enter a Paragraph and a word to Search");
		else
		{
			do
			{
				indexOfWord=restOfParagraph.indexOf(args[1]);
				restOfParagraph = restOfParagraph.substring(indexOfWord+args[1].length());
				if (indexOfWord !=-1)
					counter++;
			}while(restOfParagraph.contains(args[1]));
		System.out.println(counter);
		}
	}

}