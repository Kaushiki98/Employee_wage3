public class employee_wage{

	public static final int is_Full_Time = 1;
	public static final int is_Part_Time = 2;

	public final String company;
	public final int Emp_wage_per_hr;
	public final int num_of_days;
	public final int max_hrs;

	public employee_wage(String company, int Emp_wage_per_hr, int num_of_days, int max_hrs)
	{
		this.company = company;
		this.Emp_wage_per_hr = Emp_wage_per_hr;
		this.num_of_days = num_of_days;
		this.max_hrs = max_hrs;
	}

	public static void calEmpWage(int Emp_wage_per_hr, int num_of_days, int max_hrs)
	{

		int Emp_total_wage = 0 ;

		int empCheck = (int) (Math.floor(Math.random() * 10) % 3 );

		if(empCheck == is_Full_Time)
		{
			System.out.println("Employee is Full time ");
			Emp_total_wage = Emp_wage_per_hr * max_hrs * num_of_days;
			System.out.println("Full time Payment for one month: "+ Emp_total_wage);
		}

		else if(empCheck == is_Part_Time)
		{
			System.out.println("Employee is part timr: ");
         Emp_total_wage = Emp_wage_per_hr * max_hrs / 2 * num_of_days;
         System.out.println("Full time Payment for one month: "+ Emp_total_wage);
		}
		else
		{
			System.out.println("Employee is Abscent");
		}
	}

	public static void main(String[] args)
	{
		System.out.println(" Welcome to Employee wage Calculation ");
		employee_wage dmart = new employee_wage ("Dmart", 20, 20, 100);
		System.out.println(" The employee wage for company " + dmart.company + " wage per hour is " + dmart.Emp_wage_per_hr +" the number of days are " +dmart.num_of_days +" and maximum hours are "+ dmart.max_hrs + " hours ");
		dmart.calEmpWage (20, 20, 100);
	}
}
