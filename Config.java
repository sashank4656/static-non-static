public class Config
{
	public static String configName="System Config";
	public String settingValue;
public static void main(String args[])
{
	Config c1 = new Config();
	Config c2 = new Config();
	c1.settingValue = "Dark Mode";
	c2.settingValue = "Light Mode";
	System.out.println("Config Name :"+Config.configName);
	System.out.println("Setting 1 :"+c1.settingValue);
	System.out.println("Setting 2 :"+c2.settingValue);
	
}
}
