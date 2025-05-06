public class Department{
	public static String departmentName="HR";
	public String employeeName;
public static void main(String [] args)
{
	Department d1 = new Department();
	Department d2 = new Department();
	d1.employeeName="John";
	d2.employeeName="Alice";
	Department.departmentName="TeamLead";
	System.out.println("Department :"+Department.departmentName);
	System.out.println("Employee 1:"+d1.employeeName);
	System.out.println("Employee 2:"+d2.employeeName);
}
}
