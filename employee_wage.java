public class employee_wage{

	public static final int is_Full_Time = 1;
	public static final int is_Part_Time = 2;

	public void calEmpWage(int EmpWage, int NumOfDays , int maxHrs)
	{

		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

		if(empCheck == is_Full_Time){
			System.out.println("Employee is Full time ");
			int Payment = EmpWage * maxHrs * NumOfDays;
			System.out.println("Full time Payment for one month: "+ Payment);
		}

		else if(empCheck == is_Part_Time){
			System.out.println("Employee is part timr: ");
         int Payment = EmpWage * maxHrs * NumOfDays;
         System.out.println("Full time Payment for one month: "+ Payment);
		}
		else{
			System.out.println("Employee is Abscent");
		}
	}

	public static void main(String[] args){
		employee_wage company = new employee_wage ();
		company.calEmpWage(80,2,8);
	}
}
