import java.util.Scanner;

public class DemoProject {

	public static void main(String[] args){
		int n, id,salary, sales;
		int sum = 0;
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter number of employee : ");
		n = input.nextInt();
		
		Inputdata obj[] = new Inputdata[n];
		Process obj2[] = new Process[n];
		
		for(int i = 0;i < n;i++){
			System.out.print("Enter employee id : ");
			id = input.nextInt();
			System.out.print("Enter employee name : ");
			name = input.next();
			System.out.print("Enter employee salary : ");
			salary = input.nextInt();
			obj[i] = new Inputdata(id,name,salary);
		}
		
		System.out.println("ID     Name \t Salary");
		for(int i = 0;i < n;i++) {
			System.out.println(obj[i].toString());
		}
		
		for(int i = 0;i < n;i++) {
			System.out.print("Enter employee sales ["+obj[i].getName()+"] : ");
			sales = input.nextInt();
			obj2[i] = new Process(obj[i].salary,sales);
		}
		
		for(int i = 0;i < n;i++) {
			Output out = new Output(obj[i],obj2[i]);
		}
	}

}
