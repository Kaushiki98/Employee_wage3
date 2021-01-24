public class employee_wage{

	static final int is_Full_Time = 1;
	static final int emp_wage_per_hour = 20;
	static final int no_of_hours = 100;
	static final int days = 20;

	private void doCalculation()
	{
		System.out.println(" Welcome to employee wage calculation ");

		int emp_attendance = (int)(Math.floor(Math.random()*10) % 2);

		if(emp_attendance == is_Full_Time){
			System.out.println("Employee is present ");
			int Payment = emp_wage_per_hour * no_of_hours * days;
			System.out.println("Full time Payment for one month is: "+ Payment);
		}
		else{
			System.out.println(" Employee is abscent ");
		}
	}

	public static void main(String[] args){
		employee_wage Emp = new employee_wage();
		Emp.doCalculation();
	}
}
