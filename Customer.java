import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class CustomerDetails {
	int orderID;
	String product;
	String name;
	
	CustomerDetails(int orderID, String product, String name)
	{
		this.orderID=orderID;
		this.product=product;
		this.name=name;
	}
	
}

 public class Customer 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		List<CustomerDetails> ts=new ArrayList();
		CustomerDetails p1=new CustomerDetails(23,"abc","gaurav");
		CustomerDetails p2=new CustomerDetails(12,"def","bahadur");
		CustomerDetails p3=new CustomerDetails(11,"ghi","gb");
		CustomerDetails p4=new CustomerDetails(34,"jkl","bg");
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		for(CustomerDetails ss:ts)
		{
			System.out.println("order id : "+ss.orderID+" , product : "+ss.product+" , name : "+ss.name);
		}
		
		FileWriter writer = new FileWriter("output.txt"); 
		for(CustomerDetails str: ts) {
		  writer.write(str.orderID+" "+str.product+" " + System.lineSeparator());
		}
		writer.close();
						
		Scanner s = new Scanner(new File("output.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.nextLine());
		}
		s.close();
		Collections.sort(list);
		for(String str:list)
		{
			System.out.println(str);
		}
	}
}
