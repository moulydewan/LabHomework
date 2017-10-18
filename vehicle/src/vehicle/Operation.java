package vehicle;
import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Choose:\n1.Car\n2.Bus\n3.Ship\n4.Boat\n5.Aeroplane\n6.Helicopter\n");
			Scanner scan = new Scanner(System.in);
			int input;
			input=scan.nextInt();
			
			if(input==1)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Car C=new Car(speed);
			}
			else if(input==2)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Bus B=new Bus(speed);
			}
			else if(input==3)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Ship B=new Ship(speed);
			}
			else if(input==4)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Boat B=new Boat(speed);
			}
			else if(input==5)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Aeroplane B=new Aeroplane(speed);
			}
			else if(input==6)
			{
				System.out.println("Input speed: ");
				int speed=scan.nextInt();
				Helicopter B=new Helicopter(speed);
			}
		}
	}
}
