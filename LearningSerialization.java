import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Order implements java.io.Serializable
{
	public transient String cust_name;
	public int order_id;
	public String product_name;
	
}

public class LearningSerialization {
	public static void main(String[] args)
	{
		Order cc=new Order();
		cc.cust_name="Gaurav";
		cc.order_id=3245;
		cc.product_name="hdmi to vga cable";
		
		
		try {
			FileOutputStream fos=new FileOutputStream("order.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(cc);
			oos.close();
			fos.close();
			System.out.println("data saved in file");
		}
		catch(Exception e)
		{
			System.out.println("Some exception has occurred!");
		}
		
		
		Order data=null;
		try {
			FileInputStream fis=new FileInputStream("order.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			data=(Order)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("Some exception while reading the fiie "+e);
		}
		System.out.println("Order id "+data.order_id);
		System.out.println("Product name "+data.product_name);
		System.out.println("Customer name "+data.cust_name);
	}
}
