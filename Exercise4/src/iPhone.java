import java.util.Scanner;

public class iPhone extends SmartPhone{
	Scanner s = new Scanner(System.in);
	private double weight, price;
	private String wifi, password, bluetooth, color, processor;
	private boolean onOff;
	private int brightness, volume, storage, quantity;
	double totalPrice;
	iPhone(){
		System.out.println("------iPhone------");
			System.out.println("Enter Color");
			this.color = s.nextLine();
			System.out.println("Enter the volume");
			this.volume = s.nextInt();
			System.out.println("Enter the processor");
			this.processor = s.next();
			System.out.println("Enter the storage");
			this.storage = s.nextInt();
			System.out.println("Enter the price");
			this.price = s.nextDouble();
			System.out.println("Enter the quantity");
			this.quantity = s.nextInt();
			
			this.totalPrice = this.price * this.quantity;
			
			System.out.println("Turn on/off");
			this.onOff = s.nextBoolean();
				if (onOff == true) {
					System.out.println("The smartphone is on!");
					System.out.println();
				}
				else 
					System.out.println("The smartphone is off!");
		
			System.out.println("Please tap the name of Wi-Fi");
			this.wifi = s.next();
			
			System.out.println("Please enter the network's password");
			this.password = s.next();
			System.out.println("Wi-Fi is connected!");
		
			System.out.println("Bluetooth(on/Off)");
			this.bluetooth = s.next();
			switch (bluetooth) {
				case "on":
					System.out.println("The bluetooth is on!");
					break;
				case "Off":
					System.out.println("The bluetooth is off!");
					break;
			}
		
			System.out.println("Brightness level: ");
			this.brightness = s.nextInt();
			System.out.println("The brightness level is: " + this.brightness);
		}
		
			public String getColor() {
				return this.color;
		}
			public String getProcessor() {
				return this.processor;
		}
			public int getStorage() {
				return this.storage;
		}
			public double getPrice() {
				return this.price;
		}	
			public int getQuantity() {
				return this.quantity;
		}
			public double getTotalPrice() {
				return this.totalPrice;
	}
		   public boolean getOnOff() {
			   return this.onOff;
		}
		   public String getWifi() {
			   return this.wifi;
		}
		   public String getPassword() {
			   return this.password;
		}
		   public String getBluetooth() {
			   return this.bluetooth;
		}
		   public int getBrightness() {
			   return this.brightness;
		}
}
