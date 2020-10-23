public class RecPower
{
	static int power(int base, int expo)
	{
		if(base == 1)
		{	return 1;
		} else if( expo == 0 )
		{	return 1;
		} else if( expo == 1)
		{	return base;
		} else {
			return base * power(base, expo-1);
		}
	}
	
	static double superPower(int base, int expo)
	{
		if(base == 1)
		{	return 1;
		} else if( expo == 0 )
		{	return 1;
		} else if( expo == 1)
		{	return base;
		} else if( expo < 0)
		{	return 1.0 / power(base, expo * -1);
		} else {
			return base * power(base, expo-1);
		}
	}
	 
	public static void main (String[] args)
	{
		System.out.println( power(2, 10) );
		System.out.println( power(0, 0) );
		System.out.println( power(1, 100) );
		System.out.println( power(99, 1) );
		System.out.println( superPower(2, -2) );
	}
}

