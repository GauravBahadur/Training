import java.util.ArrayList;
import java.util.List;

class Foo implements Runnable{
	int value;
	String name;
	Foo(String name)
	{
		this.name=name;
	}	
	public void run()
	{
		value=name.length();
	}
	public int getValue()
	{
		return value;
	}
}


public class someThreading {

	public static void main(String[] args) throws InterruptedException
	{
		String[] arr= {"gaurav","bahadur","srivastava"};
		Thread t;
		List<String> list=new ArrayList<String>();
		for(String ar:arr) {
		Foo f=new Foo(ar);
		t=new  Thread(f);
		t.start();
		t.join();
		list.add("length of "+ar+" is "+f.getValue());
		}
		for(String lis:list)
			System.out.println(lis);
	}
}
