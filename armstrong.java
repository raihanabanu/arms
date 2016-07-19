# arms
public class armstrong {
	public static void main(String[] args) {
		int b=0;
		int num=Integer.parseInt(args[0]);
		int a;
		int k;
		while(num!=0)
		{
			a=num%10;
			k=a*a*a;
			b=b+k;
			num=num/10;
			System.out.println(" "+b);
		}
  if(b==num)
  {
	  System.out.println("the given number is armstrong");
  }
  else
  {
	  System.out.println("the given number is not armstrong");
  }
	}


		
	}


