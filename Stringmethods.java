import java.util.*;
class Stringmethods
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("Enter index for substring a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(str.substring(a,b));
		
		System.out.println("Enter String for concatenation:");
		String st=sc.next();
		
		String strcon=str.concat(st);
		System.out.println(strcon);
		
		int firstoccurrence=str.indexOf("Hello");//for any other occurrence, enter index
		System.out.println(firstoccurrence);
		
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str.equals(strcon));//Returns bool vals|| str.equalIgnoreCse(Strcon)
		System.out.println(str.compareTo(st));// str-strcon (lexographically compares it)||compareToIgnoreCase()
		
		System.out.println(strcon.toUpperCase());
		System.out.println(st.toLowerCase());
		String s=" "+str+" ";
		System.out.println(s.trim());//removes space from both ends
		
		System.out.println(strcon.replace("a", "b"));
		
			
		
	}
}
