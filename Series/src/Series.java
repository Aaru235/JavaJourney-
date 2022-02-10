import java.util.* ;
class Series
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("n=");
		int n= sc.nextInt();
		double s=0;
		for(int i=1;i<=n;i++)
		{
			s= s + Math.pow(i, 2);
		}
		
		System.out.println("sum ="+s);
		
	}
}

//Basic series to get understanding
//OUTPUT:
//n= 3 (terms)
//sum = 14.0 (1^2 + 2^2 +3^2)
