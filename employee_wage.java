public class employee_wage{

	static final int is_Full_Time = 1;
	static final int is_Part_Time = 2;
	static final int emp_wage_per_hr = 20;
	static final int no_of_hrs = 8;
	static final int no_of_part_time_hrs = 4;

	private void doCalculation()
	{
		System.out.println(" Welcome to employee wage calculation ");
		int emp_attendance = (int)(Math.floor(Math.random()*10) % 3);

		if( emp_attendance == is_Full_Time ){
			System.out.println(" Employee is full time ");
			int Payment = emp_wage_per_hr * no_of_hrs;
			System.out.println(" Payment is : " +Payment );
		}
		else if( emp_attendance == is_Part_Time ){
         System.out.println(" Employee is part time ");
         int Payment = emp_wage_per_hr * no_of_part_time_hrs;
         System.out.println(" Payment is : " +Payment );
		}
		else {
			System.out.println(" Employee is abscent ");
			System.out.println(" Payment is 0 ");

		}
	}

	public static void main(String[] args){
		employee_wage Emp = new employee_wage();
		Emp.doCalculation();
	}
}
