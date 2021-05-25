import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


final class Employee {

	private String fname;
	private String lname;
	private int age;
	private String company;
	private double experience;

	public static class Builder {
		private String fname;
		private String lname;
		private int age;
		private String company;
		private double experience;

		public Builder()
		{
			
		}
		
		public Employee build()
		{
			return new Employee(this);
		}
		
		public Builder forfname(String fname) {
			this.fname = fname;
			return this;
		}

		public Builder forlname(String lname) {
			this.lname = lname;
			return this;
		}

		public Builder forage(int age) {
			this.age = age;
			return this;
		}

		public Builder forcompany(String company) {
			this.company = company;
			return this;
		}

		public Builder forexperience(double experience) {
			this.experience = experience;
			return this;
		}
	}
		
	private Employee(Builder builder)
	{
		this.fname=builder.fname;
		this.age=builder.age;
		this.lname=builder.lname;
		this.experience=builder.experience;
		this.company=builder.company;
	}
	
	@Override
	public String toString()
	{
		final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("first name='").append(fname).append('\'');
        sb.append(", last name ='").append(lname).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", experience='").append(experience).append('\'');
        sb.append(", company='").append(company).append('\'');
        
        sb.append('}');
        return sb.toString();
	}
	
}

class InputFromUser {
	public static void main(String[] args) throws IOException {
		Employee.Builder builder = new Employee.Builder()
                .forfname("Gaurav")
                .forlname("Bahadur")
                .forage(23).forcompany("Wipro")
                .forexperience(1.8d);
        Employee phone = builder.build();
        System.out.println(phone);

		
	}
}
