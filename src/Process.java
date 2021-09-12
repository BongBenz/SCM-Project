
public class Process {
	int sum;
	int salary, sales;
	
	public Process(int salary, int sales) {
		this.salary = salary;
		this.sales = sales;
	}
	
	public int XProcess() {
		this.sum = 0;
		//--project A --//
		if(this.sales <= 50000){
			this.sum = (int)(0.05*this.sales);
			this.sum = this.sum + this.salary;
		}
		else if(this.sales > 50000){
			this.sum = (int)((0.10)*this.sales);
			this.sum = this.sum + this.salary;
		}
		if (this.sum <12000) {
			this.sum = 12000;
		}
		return this.sum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
