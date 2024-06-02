package my_project;

public class Banklogin 
{
	String user="sumit";
	String pass="sumit";
	int flag=0;
	int checklogin(String u,String p)
	{
		if(u.equals(user)&&p.equals(pass))
		{
			flag=1;
		}
		return flag;
	}
}
