package study;

public class Student_IET {

	private String f_name;
	private String l_name;
	private int age;
	private int grad_yr;
	private String grad_stream;
	
	
	public String getGrad_stream() {
		return grad_stream;
	}
	public void setGrad_stream(String grad_stream) {
		if(grad_stream.equals("IT") || grad_stream.equals("COMPUTER") || grad_stream.equals("ENTC") || grad_stream.equals("MECH") )
		this.grad_stream = grad_stream;
	}
	public int getGrad_yr() {
		return grad_yr;
	}
	public void setGrad_yr(int grad_yr) {
		if (grad_yr ==2017 || grad_yr ==2018 || grad_yr ==2019 || grad_yr ==2020)
			this.grad_yr = grad_yr;
		else
			System.out.println("Grad year 2017,18,19,20 allowed");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 18 && age < 80)
			this.age = age;
		else
			System.out.println("Enter age between 18 - 80");
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		if(l_name == "" || l_name == null)
			System.out.println("Name cannot be blank!");
		else
			this.l_name = l_name;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		if(f_name.equals(""))
			System.out.println("Name cannot be blank!");
		else
			this.f_name = f_name;
	}
	
	
	public String toString() {
		String str="";
		str =f_name+" "+l_name+","+age+","+grad_yr+","+grad_stream;
		return str;
	}
}

/*Assignment ---  
	  Write a class Student_IET
	  the class has following properties 
		firstName , lastName , age , graduation_year , graduation_stream 
		make all the properties as private
		write accessor and mutator methods for each property
			- in the setter methods apply following checks
				firstname, lastname cannot be blank 
				age must be greater than 18 and less than 80
				graduation year  should be 4 to 0 years before current year
				graduation_stream must be between ----  COMPUTER, IT, ELECTRICAL,MECH ,CIVIL ,CHEMICAL,AUTO

	write a User class that will create object of Student_IET  and set properties and show all properties using getters 
	while using set properties accept value from user and pass to setter.*/