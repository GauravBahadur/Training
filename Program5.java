import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class myException extends Exception
{
	public myException(String s)
	{
		super(s);
	}
}

public class Program5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to check whether it's prime or not! ");
		int n=Integer.parseInt(br.readLine());
		try {
			if(n>100)
			{
				throw new myException("Number should have been less than 100!");
			}
			if(n<=0) {
				throw new myException("Number should have been greater than 0");

			}
			else {
				if(n==1)
					System.out.println(n+ " is not a prime number!");
				else
				{
					int i;boolean b=true;
					for(i=2;i*i<=n;i++)
					{
						if(n%i==0) {
							b=false;
							break;
						}
					}
					System.out.println(b?" number entered is prime ":"number entered is not prime");
				}
			}
					
					
		}
		catch(myException e)
		{
			System.out.println("Exception occurred "+e);
		}
	}
}
