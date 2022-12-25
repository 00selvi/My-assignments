package day1.week1;

public class Bike {

	public void applyBreak() {
		
		System.out.println("apply break");

	}
	
	public void soundHorn() {
	
		System.out.println("sound horn");

	}
	
	public static void main(String[] args) {
		
		Bike br = new Bike();
		br.applyBreak();
		br.soundHorn();
		
		Car cr = new Car();
		cr.applyBrake();
		cr.soundHorn();
				
	}
}
