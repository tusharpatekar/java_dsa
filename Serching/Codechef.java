/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
  public static int gcd(int x, int y)
  {
    int  hcf =0;
    for(int i=1;i<=x || i<=y;i++)
    {
      if(x%i==0 && y%i==0)
      {
        hcf=i;
      }
    }
    return hcf;
  }
  
  public static int lcm(int x, int y)
  {
    int lcm;
    
    lcm = (x>y) ? x:y;
    
    while(true)
    {
      if(lcm%x==0 && lcm%y==0)
      {
        return lcm;
      }
      lcm++;
    }
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	  
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  int count=sc.nextInt();
		  
		  
		  for(int j= 0; j<count;j++)
		  {
		   if(x>y)
		   {
		    x=gcd(x,y);
		    if(x>y)
		    {
		      x=lcm(x,y);
		    }
		    else
		    {
		      y=lcm(x,y);
		    }
		    
		   }
		   else{
		     y=gcd(x,y);
		     if(y>x){
		     y=lcm(x,y);
		     }
		     else
		     {
		       x=lcm(x,y);
		     }
		   }
		    
		  }
		  System.out.println(x+y);
		  
		}
	}
}
