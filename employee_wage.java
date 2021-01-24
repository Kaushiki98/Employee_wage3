public class employee_wage{

	static final int is_Full_Time = 1;

	private void doCalculation()
	{
		System.out.println(" Welcome to employee wage calculation ");
		int emp_attendance = (int)(Math.floor(Math.random()*10) % 2);
		if( emp_attendance == 1 ){
			System.out.println(" Employee is present ");
		}
		else {
			System.out.println(" Employee is abscent ");
		}
	}

	public static void main(String[] args){
		employee_wage Emp = new employee_wage();
		Emp.doCalculation();
	}
}
