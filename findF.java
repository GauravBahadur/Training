import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class factorial implements Callable<Integer> {
	
	int n;
	public factorial(int n)
	{
		this.n=n;
	}
	@Override
		public Integer call() throws Exception {
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			return fact;
		}
}

class findF{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		int arr[]= {3, 2,5, 4, 1};
		int maxThread=5;
		ExecutorService poool = Executors.newFixedThreadPool(maxThread);		
		List<Future<Integer>> list=new ArrayList();
		for(int i:arr)
		{
			Future<Integer> future=poool.submit(new factorial(i));
			list.add(future);
		}
		for(Future<Integer> lis:list)
		{
			System.out.println(lis.get());
		}
		poool.shutdown();
		System.out.println("Program terminated!");
	}
}
