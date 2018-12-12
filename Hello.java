interface SalaryChangedListener{ // the interface class jsut mediator
	public void onSalaryChange(String message); // code ofr this System.out.println(message);
}

class Employee{
	private String name;
	private int salary;
	private SalaryChangedListener listener; // his is reference for the interface  object 
	public Employee(String name){
		this.name=name;
		this.salary=10000;
	}
	public void setListener(SalaryChangedListener listener) //just a setter
	{
		this.listener=listener;
	}
	public void changeSalary(int i){
		this.salary+=i;
		if(i>0)
		{
			if(listener!=null){//can listner be nll? what ccase?
				listener.onSalaryChange("your salary has increased"); //sends args where it is implemented
			}
		}
	}
}

class Hello{
	public static void main(String[] args) {
		Employee e= new Employee("someone"); //automatically sets defalt salary 
		// SalaryChangedListener a = new salary changed listerer()
		e.setListener(new SalaryChangedListener(){
			public void onSalaryChange(String message){ //overriding babe
				System.out.println(message);
			}
		});
	e.changeSalary(1000);
	}
}