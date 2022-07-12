package week1.day1;

public class Firefox {
	private static final char[] Speed = null;
	float version =100.2f;
	String name="firefox";
	boolean visible = true;
	int year = 1998;
	char logo = 'M';
	
	public void edge()
	{
		float version=103.3f;
		String name ="Edge";
		System.out.println("Edge Method");
	}
	public void chrome() 
	{
		int speed=500;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		float version= 100.2f;
		Firefox browser = new Firefox();
		System.out.println(browser.logo);
		System.out.println(version);
		System.out.println(browser.name);
		System.out.println(browser.year);
		browser.chrome();
		browser.edge();
	}
}
