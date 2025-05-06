public class Computer
{
	public static String os="Window";
	public String ram;
public static void main(String args[])
{
	Computer c1 = new Computer();
	Computer c2 = new Computer();
	c1.ram = "8GB";
	c2.ram = "16GB";
	System.out.println(" OS :"+Computer.os);
	System.out.println("Computer 1 :"+c1.ram);
	System.out.println("Computer 2 :"+c2.ram);
	
}
}
