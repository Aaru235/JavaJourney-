import java.util.* ;
class Series
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		double s=0;
		for(int i=1;i<=n;i++)
		{
			s= s + Math.pow(i, 2);
		}
		
		System.out.println("sum="+s);
		
	}
}