import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class AbstractShape{

	String getMessage;
	abstract void getMess();
	
	public void displayMessage(String getMessage)
	{
		System.out.println("Shape is "+getMessage);
	}
}

class square extends AbstractShape{

	@Override
	void getMess() {
		getMessage="Square";
	}
}

class circle extends AbstractShape{

	@Override
	void getMess() {
		getMessage="Circle";
	}
}

class rectangle extends AbstractShape{

	@Override
	void getMess() {
		getMessage="Rectangle";
	}
}


class findWhichShape
{
	public AbstractShape getShape(String ShapeByUser)
	{
		 if(ShapeByUser.equalsIgnoreCase("circle"))
			return new circle();
		else if(ShapeByUser.equalsIgnoreCase("square"))
			return new square();
		else if(ShapeByUser.equalsIgnoreCase("rectangle"))
			return new rectangle();
		else
			return null;
		
	}
}

class InputShapeFromUser
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the shape , for ex. circle, square or rectangle!");
		String ShapeByUser=br.readLine();
		findWhichShape fws=new findWhichShape();
//		fws.getShape(ShapeByUser).displayMessage(ShapeByUser);
		AbstractShape as=fws.getShape(ShapeByUser);
		as.displayMessage(ShapeByUser);
	}
}