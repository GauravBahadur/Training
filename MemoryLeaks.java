import java.util.Vector;

public class MemoryLeaks {
    static int y=75645343;
	public static void main(String[] args)
	{
        Vector a = new Vector(214744444);
        int x=13243545;
        MemoryLeaks ml=new MemoryLeaks();
        int z=ml.val();
        System.out.println(x);
	}
	
	public int val()
	{
		int x=73436764;
		return x;
	}
	
	//3 memory leaks are in this program
	//1- assigning large values to object
	//2- not clearing the object once  they are not required
	//3- Unnecessary call to val, which returns a large value which is not being used anywhere
}
