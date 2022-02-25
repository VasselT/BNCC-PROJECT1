import vehicle.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	
	Scanner scan = new Scanner(System.in);
	Vehicle inputCar = new Car();
	Vehicle inputMotor = new Motorcycle();
	static String inpVehicle;
	
//	VIEW MENU
	void viewMenu() {
		if (inputCar.getvBrand().isEmpty() || inputMotor.getvBrand().isEmpty()) {
			Integer input;
			do {
				System.out.println("Number: ");
				System.out.println("----------------------------");
				System.out.println("Vehicle: ");
				System.out.println("Name: " );
				System.out.print("Input 0 to exit: ");
				input = scan.nextInt();
				scan.nextLine();
				System.out.println("");
				
			} while (input != 0);

		} else {			
//			LOOPING
			Integer viewChoose = 0;
			int i = 0;
			
			do {					
					for (; i < inputCar.getvBrand().size(); i++) {
						System.out.println("Number: "+ (i + 1));
						System.out.println("----------------------------");
						System.out.println("Vehicle: "+ inputCar.getvVehicle().get(i));
						System.out.println("Name: "+ inputCar.getvName().get(i));					
						System.out.println("");
					}					
			System.out.print("Pick a vehicle number to test drive [ 0 to exit ]: ");
			try {
				viewChoose = scan.nextInt();	
			} catch (Exception e) {
				// TODO: handle exception
			}			
			scan.nextLine();			
			if (viewChoose == 0) {
				return;
			}			
			} while (viewChoose < 0 || viewChoose > inputCar.getvBrand().size());
			
			System.out.println("Brand: "+ this.inputCar.getvBrand().get(viewChoose - 1) );
			System.out.println("Name: "+ this.inputCar.getvName().get(viewChoose - 1));
			System.out.println("License plate: "+ this.inputCar.getvLicense().get(viewChoose - 1));
			System.out.println("Car type: "+ this.inputCar.getvType().get(viewChoose - 1));
			System.out.println("Top Speed: "+ this.inputCar.getvTopSpeed().get(viewChoose - 1));
			System.out.println("Gas Capacity: "+ this.inputCar.getvGasCap().get(viewChoose - 1));
			System.out.println("Wheels: "+ this.inputCar.getvWheels().get(viewChoose - 1));
			
			if(this.inputCar.getvVehicle().get(viewChoose - 1).equals("Car")) {
				System.out.println("Entertainment system: "+ this.inputCar.getvUnique().get(viewChoose - 1));
			}
				
			if (this.inputCar.getvType().get(viewChoose - 1).equals("Supercar")) {
					System.out.println("Boosting!");		
					System.out.println("");
				} else if (this.inputCar.getvType().get(viewChoose - 1).equals("SUV") ||
						this.inputCar.getvType().get(viewChoose - 1).equals("Minivan")) {
					System.out.println("Turning on Entertainment system...");
					System.out.println("");
				}
			
			if(this.inputMotor.getvVehicle().get(viewChoose - 1).equals("Motorcycle")) {
				Integer helmet = 0;
					System.out.println("Helmet: "+ this.inputMotor.getvUnique().get(viewChoose - 1));
					System.out.println(this.inputMotor.getvName().get(viewChoose - 1) +" is standing!");		
					System.out.println("");
					System.out.print("Input helmet price: " );		
					helmet = scan.nextInt();
					scan.nextLine();
					System.out.println("Helmet price = "+ helmet);
					System.out.println("");
		}
			
			} 
			}

	void mainMenu() {
		Integer chooseMenu = 0;
		
		do {
			System.out.println("   Menu");
			System.out.println("===========");
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.println("===========");	
			System.out.print(">> ");
			try {				
				chooseMenu = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			} 
			scan.nextLine();
			System.out.println("");
			
			switch (chooseMenu) {
			case 1:
				
				do {
					System.out.print("Input vehicle [ Car / Motorcycle (case sensitive) ]: ");
					inpVehicle = scan.nextLine();
					if (inpVehicle.equals("Car")) {
						inputCar.input();
					} else if (inpVehicle.equals("Motorcycle")){
						inputMotor.input();
					}					
				} while (!inpVehicle.equals("Car") && !inpVehicle.equals("Motorcycle"));
				this.inputCar.getvVehicle().add(inpVehicle);
				break;

			case 2:
				viewMenu();
				break;
				
			case 3:
				break;
			default:
				break;
			}
		} while (chooseMenu != 3);
	}
	
	public Main() {
		mainMenu();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new Main();		
	}

}
