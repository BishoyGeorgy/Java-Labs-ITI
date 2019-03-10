public class MaxMin
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
		int max=arr[0],min=arr[0];
		for(int i=0;i<1000;i++)
		{
			if(arr[i]>max)
				max=arr[i];

			if(arr[i]<min)
				min=arr[i];	
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);
		long compileTime = endTime-startTime;
		System.out.println("The Running Time = "+compileTime);
		
	}
}