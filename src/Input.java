
public class Input {

	private int sales;
	private int id;
	private String name;
	private int salary;

	public Input (int id, String n,int salary,int sales){
		this.id = id;
		this.name = n;
		this.salary = salary;
		this.sales = sales;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getSales(){
		return this.sales;
	}
	
	public void setSales(int sales){
		this.sales = sales;
	}

}