import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class factorial implements Runnable {
	
	int n;
	public factorial(int n)
	{
		this.n=n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of "+n+" = "+fact);
		
	}

}

class findF{
	public static void main(String[] args)
	{
		int arr[]= {5, 7,12, 6, 9};
		Runnable f;
		int maxThread=5;
		for(int i=0;i<5;i++)
		{
			f=new factorial(arr[i]);
			ExecutorService poool = Executors.newFixedThreadPool(maxThread);			
			poool.execute(f);
		}
	}
}
