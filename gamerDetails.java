import java.util.Set;
import java.util.TreeSet;

class Details implements Comparable<Details>{
	String name;
	int age;
	String game;
	public Details(String name, int age, String game)
	{
		this.name=name;
		this.age=age;
		this.game=game;
	}
	
//	public int compare(Details d1,)
	public int compareTo(Details d)
	{
		if(name.compareTo(d.name)==0)
			return 0;
		else {
		if(game.compareTo(d.game)>0)
		{
			return 1;
		}
		else if(d.game.compareTo(game)>0)
			return -1;
		else if(d.game.compareTo(game)==0)
		{
			if(age>d.age)
				return 1;
			else if(d.age>age)
				return -1;
		}
		return 0;
		}
	}
}
public class gamerDetails {
	
	public static void main(String[] args)
	{
		Set<Details> set=new TreeSet<Details>();
		
		int age[]= {4,6,1,5};
		String game[]= {"abc","def","def","zzz"};
		String name[]= {"abc","def","abc","jkl"};
		Details ds;
		for(int i=0;i<4;i++)
		{
			set.add(new Details(name[i],age[i],game[i]));
		}
		
		for(Details det:set)
		{
			System.out.println("name = "+det.name+" , age = "+det.age+" , game = "+det.game);
		}
		
	}

}
