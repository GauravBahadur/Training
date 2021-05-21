import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	 String name;
	 int age;
	 int id;
	
	
	public Student(String name, int age, int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public String getName()	{
		return name;
	}
	public int getAge()	{
		return age;
	}
	public int getId()	{
		return id;
	}
	
	/*
	public void setName(String name)	{
		this.name=name;
	}
	public void setAge(int age)	{
		this.age=age;
	}
	public void setId(int id){
		this.id=id;
	}
	*/
	
	public int compareTo(Student st){         
	    return this.name.compareTo(st.name);   
	  }
}


public class Program1 {

	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("ghi",18,9));
		al.add(new Student("def",45,3));
		al.add(new Student("abc",30,2));
		
		
		Collections.sort(al);
		for(Student all:al)
		{
			System.out.println(all.name+" "+all.age+" "+all.id);
		}
		
		
		Collections.sort(al, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age==o2.age)
				       return 0;
				   else if(o1.age>o2.age)
				       return 1;
				   else
				       return -1;
			}
		});
		
		System.out.println("after sorting with age \n\n\n");
		for(Student all:al)
		{
			System.out.println(all.name+" "+all.age+" "+all.id);
		}
		
		
		Collections.sort(al, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id==o2.id)
				       return 0;
				   else if(o1.id>o2.id)
				       return 1;
				   else
				       return -1;
			}
		});
		
		
		System.out.println("after sorting with id \n\n\n");
		for(Student all:al)
		{
			System.out.println(all.name+" "+all.age+" "+all.id);
		}
		
	}

}
