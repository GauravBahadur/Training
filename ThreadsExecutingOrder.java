import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class sumOfDigits implements Callable<Integer> 
{
	private int n;
	public sumOfDigits(int n)
	{
		this.n=n;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("n is "+n+" , sum is "+sum);
		return sum;
	}
	
}


public class ThreadsExecutingOrder {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int arr[]= {15, 4, 10};
		int maxThread=3;
		ExecutorService poool = Executors.newFixedThreadPool(maxThread);
		List<Future<Integer>> list=new ArrayList();
		for(int i:arr)
		{
			Future<Integer> future=poool.submit(new sumOfDigits(i));
			list.add(future);
			if(!future.isDone())
				Thread.sleep(4000);
		}
		for(Future<Integer> lis:list)
		{
			System.out.println(lis.get());
		}
		poool.shutdown();
		System.out.println("Program terminated!");
		
	}

}
