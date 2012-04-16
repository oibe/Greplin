
public class Problem2 
{
	public static boolean isPrime(int n )
	{
		if(n == 1)
			return false;
		
		if(n == 2 || n == 3)
			return true;
		if((n % 2) == 0)
			return false;
		
		for(int i = 3; i < Math.sqrt(n)+1;i+=2)
		{
			if((n % i) == 0)
				return false;
		}
		return true;
	}
	
	public static int primeFib(int min)
	{
		int a = 1;
		int b = 1;
		for(;;)
		{
			if(a > min && isPrime(a))
				return a;
			int temp = a;
			a = b;
			b += temp;
		}
	}
	
	public static int sumPrimeDivisors(int n)
	{
		int sum = 0;
		for(int i = 1; i < (n/2) +1;i++)
		{
			if((n % i) == 0 && isPrime(i))
				sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		//step 1 = 317811
		int x = primeFib(227000);
		
		System.out.println("answer is "+sumPrimeDivisors(x+1));
	}
}
