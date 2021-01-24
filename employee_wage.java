public class employee_wage{

	static final int is_Full_Time = 1;
	static final int is_Part_Time = 2;
	static final int emp_wage_per_hour = 20;
	static final int no_of_hours = 8;
	static final int no_of_part_time_hours = 4;

	private void doCalculation()
	{
		System.out.println(" Welcome to employee wage calculation ");

		int emp_attendance = (int)(Math.floor(Math.random()*10) % 3);

		switch (emp_attendance) {

		case 0:
			System.out.println("Employee is present ");
			int Payment = emp_wage_per_hour * no_of_hours;
			System.out.println("Payment is: "+ Payment);
			break;
		case 1:
			System.out.println("Employee is part time");
			int Payments = emp_wage_per_hour * no_of_part_time_hours;
			System.out.println("Part time Payment is: "+ Payments);
			break;
		case 2:
			System.out.println("Employee is Abscent");
			System.out.println("Payment is 0");
			break;

		}
	}

	public static void main(String[] args){
		employee_wage Emp = new employee_wage();
		Emp.doCalculation();
	}
}
