
public class Inputdata {
	int id,salary;
	String name;
	
	public Inputdata(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getid(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString(){
		String s;
		s = this.id+" "+this.name+"\t"+this.salary;
		return s;
	}

}
