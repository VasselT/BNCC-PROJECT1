package vehicle;

import java.util.ArrayList;

public abstract class Vehicle {
	static private ArrayList<String> vVehicle = new ArrayList<>();
	static private ArrayList<String> vBrand = new ArrayList<>();
	static private ArrayList<String> vName = new ArrayList<>();
	static private ArrayList<String> vLicense = new ArrayList<>();
	static private ArrayList<Integer> vTopSpeed = new ArrayList<>();
	static private ArrayList<Integer> vGasCap = new ArrayList<>();
	static private ArrayList<Integer> vWheels = new ArrayList<>();
	static private ArrayList<String> vType = new ArrayList<>();
	static private ArrayList<Integer> vUnique = new ArrayList<>();
	static private ArrayList<Integer> vGeneral = new ArrayList<>();
	
	public static ArrayList<Integer> getvGeneral() {
		return vGeneral;
	}

	public static void setvGeneral(ArrayList<Integer> vGeneral) {
		Vehicle.vGeneral = vGeneral;
	}

	public static ArrayList<String> getvVehicle() {
		return vVehicle;
	}

	public static void setvVehicle(ArrayList<String> vVehicle) {
		Vehicle.vVehicle = vVehicle;
	}

	public static ArrayList<String> getvBrand() {
		return vBrand;
	}

	public static void setvBrand(ArrayList<String> vBrand) {
		Vehicle.vBrand = vBrand;
	}

	public static ArrayList<String> getvName() {
		return vName;
	}

	public static void setvName(ArrayList<String> vName) {
		Vehicle.vName = vName;
	}

	public static ArrayList<String> getvLicense() {
		return vLicense;
	}

	public static void setvLicense(ArrayList<String> vLicense) {
		Vehicle.vLicense = vLicense;
	}

	public static ArrayList<Integer> getvTopSpeed() {
		return vTopSpeed;
	}

	public static void setvTopSpeed(ArrayList<Integer> vTopSpeed) {
		Vehicle.vTopSpeed = vTopSpeed;
	}

	public static ArrayList<Integer> getvGasCap() {
		return vGasCap;
	}

	public static void setvGasCap(ArrayList<Integer> vGasCap) {
		Vehicle.vGasCap = vGasCap;
	}

	public static ArrayList<Integer> getvWheels() {
		return vWheels;
	}

	public static void setvWheels(ArrayList<Integer> vWheels) {
		Vehicle.vWheels = vWheels;
	}

	public static ArrayList<String> getvType() {
		return vType;
	}

	public static void setvType(ArrayList<String> vType) {
		Vehicle.vType = vType;
	}

	public static ArrayList<Integer> getvUnique() {
		return vUnique;
	}

	public static void setvUnique(ArrayList<Integer> vUnique) {
		Vehicle.vUnique = vUnique;
	}
	private String brand;
	private String name;
	private String license;
	private Integer topSpeed;
	private Integer gasCap;
	private Integer wheels;
	private String type;
	
	public abstract void input();
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	public Integer getGasCap() {
		return gasCap;
	}
	public void setGasCap(Integer gasCap) {
		this.gasCap = gasCap;
	}
	public Integer getWheels() {
		return wheels;
	}
	public void setWheels(Integer wheels) {
		this.wheels = wheels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
