package vehicle;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner scan = new Scanner (System.in);
	
	private Integer enterprise;
	public Integer getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Integer enterprise) {
		this.enterprise = enterprise;
	}
	
	public void input () {
		String iBrand;
		do {
		System.out.print("Input car brand [ >= 5 words ]: ");
		iBrand = scan.nextLine();
		this.setBrand(iBrand);
		} while (iBrand.length() < 5);
		
		String iName;
		do {
		System.out.print("Input car name [ >= 5 words ]: ");
		iName = scan.nextLine();
		this.setBrand(iName);
		} while (iName.length() < 5);
		
		String iLicense;
		do {
			System.out.print("Input car license [ ex: B 1234 ABC ]: ");
			iLicense = scan.nextLine();
			this.setLicense(iLicense);
		} while (iLicense.length() < 5 || iLicense.length() > 10);

		Integer iTopSpeed= 0;
		do {
			System.out.print("Input car topspeed [ 100 - 250 ]: ");
			try {
				iTopSpeed = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}			
			scan.nextLine();
			this.setTopSpeed(iTopSpeed);
		} while (iTopSpeed < 100 || iTopSpeed > 250);
		
		Integer iGasCap= 0;
		do {
			System.out.print("Input car gas capacity [ 30 - 60 ]: ");
			try {
				iGasCap = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}			
			scan.nextLine();
			this.setGasCap(iGasCap);
		} while (iGasCap < 30 || iGasCap > 60);
		
		Integer iWheels = 0;
		do {
			System.out.print("Input car wheels [ 4 - 6 ]: ");
			try {
				iWheels = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}			
			scan.nextLine();
			this.setWheels(iWheels);
		} while (iWheels < 4 || iWheels > 6);
		
		String iType;
		do {
			System.out.print("Input car type [ SUV | Supercar | Minivan ]: ");
			iType = scan.nextLine();
			this.setType(iType);
		} while (!iType.equals("SUV") && !iType.equals("Supercar") && !iType.equals("Minivan") );
		
		Integer iEnterprise = 0;
		do {
			System.out.print("Input car entertainment system amount [ >= 1 ]: ");
			try {
				iEnterprise = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}			
			scan.nextLine();
			this.setEnterprise(iEnterprise);
		} while (iEnterprise < 1);
		
		String enter;
		do {
			System.out.print("Press enter to continue");
			enter = scan.nextLine();
		} while (enter.equals(""));
		
		System.out.println("");
		
//		this.getvBrand().add(this.getBrand());
//		this.getvName().add(this.getName());
//		this.getvLicense().add(this.getLicense());
//		this.getvTopSpeed().add(this.getTopSpeed());
//		this.getvGasCap().add(this.getGasCap());
//		this.getvWheels().add(this.getWheels());
//		this.getvType().add(this.getType());
//		this.getvUnique().add(this.getEnterprise());
		
		this.getvBrand().add(iBrand);
		this.getvName().add(iName);
		this.getvLicense().add(iLicense);
		this.getvTopSpeed().add(iTopSpeed);
		this.getvGasCap().add(iGasCap);
		this.getvWheels().add(iWheels);
		this.getvType().add(iType);
		this.getvUnique().add(iEnterprise);
	}
}
