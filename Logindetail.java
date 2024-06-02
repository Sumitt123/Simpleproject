package my_project;
import java.util.Scanner;

class User extends Banklogin 
{
	int bal=5000,amt;
	Scanner ip=new Scanner(System.in);
	void deposite()
	{
		System.out.println("Enter the amount to be deposite");
		amt=ip.nextInt();
		if (amt>0)
		{
			bal=bal=amt;
			System.out.println("Amount Deposite="+amt);
			System.out.println("Balance="+bal);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	void withdrawal()
	{
		System.out.println("Enter the amount to be withdrawal=");
		amt=ip.nextInt();
		
		if(amt>0 && amt<=bal)
		{
			bal=bal-amt;
			System.out.println("Amount withdrawal="+amt);
			System.out.println("Balance="+bal);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	void show()
	{
		System.out.println("Balance="+bal);
	}
	int menu(String u,String p)
	{
		int f =checklogin(u,p);
		if(f==1)
		{
			System.out.println("Press 1 for deposite amount:");
			System.out.println("Press 2 for withdrawal amount:");
			System.out.println("Press 3 for check balance:");
			
			int ch=ip.nextInt();
			switch(ch)
			{
				case 1:
					deposite();
					break;
					
				case 2:
					withdrawal();
					break;
					
				case 3:
					show();
					break;
					
					default:
						System.out.println("invalid choice");
			}
		}
		else 
		{
			System.out.println("invalid Login detail");
		}
		return flag ;
	}

}


class  Logindetail extends User
{
	String user;
    String pass;
    int count=3;
    
    void credentail()
    {
    	System.out.println("Enter the username and password");
    	user=ip.nextLine();
    	pass=ip.nextLine();
    			int f=menu(user,pass);
    	count--;
    	if(f==0 && count>0)
    	{
    		System.out.println("Attempt left="+count);
    		credentail();
    	}
    }
    public static void main(String arg[])
    {
    	Logindetail ob=new Logindetail();
    	ob.credentail();
    	
    }
}


