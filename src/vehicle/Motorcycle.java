package vehicle;

import java.util.Scanner;

public class Motorcycle extends Vehicle{
	Scanner scan = new Scanner (System.in);
	
	private Integer helmet;
	public Integer getHelmet() {
		return helmet;
	}

	public void setHelmet(Integer helmet) {
		this.helmet = helmet;
	}
	
	public void input () {
			String iBrand;
			do {
			System.out.print("Input motorcycle brand [ >= 5 words ]: ");
			iBrand = scan.nextLine();
			this.setBrand(iBrand);
			} while (iBrand.length() < 5);
			
			String iName;
			do {
			System.out.print("Input motorcycle name [ >= 5 words ]: ");
			iName = scan.nextLine();
			this.setName(iName);
			} while (iName.length() < 5);
			
			String iLicense;									
			do {
				System.out.print("Input motorcycle license [ ex: B 1234 ABC ]: ");
				iLicense = scan.nextLine();
				this.setLicense(iLicense);
			} while (iLicense.length() < 5 || iLicense.length() > 10);
			
			Integer iTopSpeed = 0;
			do {
				System.out.print("Input motorcycle topspeed [ 100 - 250 ]: ");
				try {
				    iTopSpeed = scan.nextInt();	
				} catch (Exception e) {
					// TODO: handle exception
				}

				scan.nextLine();
				this.setTopSpeed(iTopSpeed);
			} while (iTopSpeed < 100 || iTopSpeed > 250);
			
			Integer iGasCap = 0;
			do {
				System.out.print("Input motorcycle gas capacity [ 30 - 60 ]: ");
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
				System.out.print("Input motorcycle wheels [ 2 - 3 ]: ");
				try {
					iWheels = scan.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
				}				
				scan.nextLine();
				this.setWheels(iWheels);
			} while (iWheels < 2 || iWheels > 3);
			
			String iType;
			do {
				System.out.print("Input motorcycle type [ Matic | Automatic ]: ");
				iType = scan.nextLine();
				this.setType(iType);
			} while (!iType.equals("Matic") && !iType.equals("Automatic") );
			
			Integer iHelmet = 0;
			do {
				System.out.print("Input motorcycle helmet [ >= 1 ]: ");
				try {
					iHelmet = scan.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
				}				
				scan.nextLine();
				this.setHelmet(iHelmet);
			} while (iHelmet < 1);
			
			String enter;
			do {
				System.out.print("Press enter to continue");
				enter = scan.nextLine();
			} while (enter.equals(""));
			
			System.out.println("");
			
//			this.getvBrand().add(this.getBrand());
//			this.getvName().add(this.getName());
//			this.getvLicense().add(this.getLicense());
//			this.getvTopSpeed().add(this.getTopSpeed());
//			this.getvGasCap().add(this.getGasCap());
//			this.getvWheels().add(this.getWheels());
//			this.getvType().add(this.getType());
//			this.getvUnique().add(this.getHelmet());
			
			this.getvBrand().add(iBrand);
			this.getvName().add(iName);
			this.getvLicense().add(iLicense);
			this.getvTopSpeed().add(iTopSpeed);
			this.getvGasCap().add(iGasCap);
			this.getvWheels().add(iWheels);
			this.getvType().add(iType);
			this.getvUnique().add(iHelmet);
	}
}
