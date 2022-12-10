//reutrn fact of number
import java.util.*;
class demo
{
	int fact=1;
	String name;
	
	demo()
	{}
	demo(String name)
	{
		this.name=name;
	}

		
	
	int fact (int n)
	{
		
		System.out.println("Names:"+name);
	
		for(int i=n;i>=1;i--)
		{ 
			fact = fact*i;
			//System.out.println("Factorial Number:"+fact);			
		}
	return fact;	
	}
}


class factApp
{
	public static void main(String[] args) {
	int fact=1;
	
	demo d = new demo(name );
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A Name:");
	String name = sc.nextLine();
	System.out.println("Enter A Number:");
	int n = sc.nextInt();
	

	
	
	int ans=d.fact(n);
	System.out.println("Ans Number:"+ans);
	//System.out.println("Names ares:"+names);
		

}

}