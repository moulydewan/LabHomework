package vehicle;

public class Vehicle {
	int s;
	public void speed(int k) {
		s=k;
		System.out.println("Speed: "+s+"km/h");
	}
	public void isRunning() {
		if(s==0)
			System.out.println("Not Running.");
		else
			System.out.println("Running.");
	}
}
