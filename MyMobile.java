package week1.day2;

public class MyMobile {
	short phnoeno=911;
	short frndno=119;
	long imei=353466;
	long iccid=91919191;
	public void makeCall()
	{
		System.out.println("calling");
	}
	public void sendMsg() 
	{
		System.out.println("Sending msg");
	}
	public static void main(String[] args)
	{
		
		MyMobile call = new MyMobile();
		System.out.println(call.iccid);
		System.out.println(call.phnoeno);
		call.makeCall();
		call.sendMsg();
	}
}
