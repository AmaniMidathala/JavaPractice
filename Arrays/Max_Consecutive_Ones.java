//https://youtu.be/Z-AEtv_W6xI?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays.copy;

public class Max_Consecutive_Ones 
{
	public static void main(String[] args)
	{
		int arr[]={1,1,0,1,1,1};
		int max=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
				max=Math.max(count, max);
			}
			else if(arr[i]==0)
				count=0;
		}
		System.out.println(max);
				
		// Second Approach
		/*
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==1)
					count++;
				else
					break;
			}
			max=Math.max(count, max);
		}
		System.out.println(max);
		*/
	}
}
