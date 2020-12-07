package repeat_string;
import java.util.Scanner;
public class Repeat_String 
{
	static char ch;
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String Value : ");
	String Name = sc.next();
	//String Name = "tamilselvan"; 
	int len = Name.length();
	int i = 0;
	while(i<=len-1)
	{
		char ch = Name.charAt(i);
		for(int j=i+1;j<=len-1;j++)
		{
			if(ch==Name.charAt(j))
			{
				System.out.println(Name.charAt(j));
			}
		}
		i++;
	}
	for(int k=0;k<=Name.length()-1;k++)
	{
		if(ch!=Name.charAt(k))
		{
			string(ch,Name);
			break;
		}
	}
	}

	static void string(char ch,String Name) 
	{
	boolean flag = true;
	for(int x=0;x<=Name.length()-1;x++)
	{
		ch = Name.charAt(x);//a,b,c,d
		for(int y=x+1;y<=Name.length()-1;y++)
		{
		if(ch!=Name.charAt(y))//{a=b;a=b;
			{
				System.out.println("'"+Name+"'"+" this String is not have repeated characters");
			break;
			}
		else if(ch==Name.charAt(y))
			{
				System.out.println("Repeated characters have been shown");
			break;
			}
		}
	break;
	}
	}
}

