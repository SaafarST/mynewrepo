public class sumoflen{

	public static void main(String[] args)
	{
		int sum = 0;
	for(String arg:args)
	{
		sum += LengthofString(arg);
	}
	System.out.print(sum);
	
	}
	public static int LengthofString(String str)
	{
		return str.length();
	}
}