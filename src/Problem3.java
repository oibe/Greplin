import java.util.ArrayList;


public class Problem3 
{
	public static void main(String[] args)
	{
		String[] input = "3, 4, 9, 14, 15, 19, 28, 37, 47, 50, 54, 56, 59, 61, 70, 73, 78, 81, 92, 95, 97, 99".split(", ");
		int[] arr = new int[input.length];
		for(int i = 0; i < input.length;i++)
			arr[i] = Integer.parseInt(input[i]);
		
		int count = 0;
		
		for(int i = 1; i < Math.pow(2, input.length)-1;i++)
		{
			ArrayList<Integer> subset = new ArrayList<Integer>();
			for(int j = 0; j < input.length;j++)
			{
				if(((i >> j) & 0x1) == 1)
				{
					subset.add(arr[j]);
				}
			}
			
			int sum = 0;
			for(int k= 0; k < subset.size()-1;k++)
			{
				sum+=subset.get(k);
			}
			if(subset.size() > 1 && sum == subset.get(subset.size()-1))
				count++;
		}
		System.out.println("answer = "+count);
	}
}
