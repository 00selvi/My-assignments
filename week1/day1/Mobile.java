package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel = "oneplus";
		float  mobileWeight= 143.4f;
		System.out.println("This is my mobile");
		System.out.println("Mobile Model:" +mobileModel);
		System.out.println("Mobile Weight:" +mobileWeight);
		
		}

	public void sendMsg() {
		
	boolean fullCharged = true;
	int     mobileCost  = 10000;
	
	System.out.println("Full charged:" +fullCharged);
	System.out.println("Mobile Cost:" +mobileCost);
	
	}
	
	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
}
	
}