public class SearchingForNumber
{

public static void main(String args [])
	{
		long startTime=System.currentTimeMillis();
		System.out.println(startTime);
		int arr [];
		arr = new int[1000];
		for (int i=0;i<1000;i++)
		{
			arr[i]=(int)(1000*Math.random());
		}
		if (args.length !=1)
			System.out.println("Enter one Number to search");
		else
			{
				int num =Integer.parseInt(args[0]);
				int x=binarySearch(arr,num);
				System.out.println("found");
			}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);
		long compileTime = endTime-startTime;
		System.out.println("The Compile Time = " +compileTime);
	}
	


	public static void sortSelection(int arr[])
	{
		int i,j,min;
		for(i=0;i<arr.length-1;i++)
		{
			min=i;
			for(j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[min])
				min=j;
			}

		if (i!=min)
		{
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		}

	}

	public static int binarySearch(int arr [],int num)
		{
			sortSelection(arr);

			boolean found=false;
			int high=arr.length-1;
			int low=0;
			int mid=-1;

			while((!found)&&(low<=high))
			{
				mid=(high+low)/2;
				if(arr[mid]>num && low !=high-1)
					{
					//System.out.println("High = "+high);
					//System.out.println("mid = "+mid);
					high=mid;
					}
				else if (arr[mid]<num && low != 0)
					{
					//System.out.println("low = "+low);
					//System.out.println("mid = "+mid);
					low=mid;
					
					}
				else
					found=true;
			}

			if(found)
				return mid;
			else
				return -1;

		}

}