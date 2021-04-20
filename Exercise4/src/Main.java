
public class Main {

	public static void main(String[] args) {
		iPhone iPhone = new iPhone();
		System.out.println(iPhone.getWeight());
		System.out.println("Color: " + iPhone.getColor());
		System.out.println("Processor: " + iPhone.getProcessor());
		System.out.println("Storage: " + iPhone.getStorage() + "GB");
		System.out.println("Price: " + iPhone.getPrice());
		System.out.println("Quantity: " + iPhone.getQuantity());
		System.out.println("Total Price: " + iPhone.totalPrice);

		System.out.println();
		
		Samsung Samsung = new Samsung();
		System.out.println("------Samsung------");
		System.out.println(Samsung.getWeight());
		System.out.println("Color: " + Samsung.getColor());
		System.out.println("Processor: " + Samsung.getProcessor());
		System.out.println("Storage: " + Samsung.getStorage() + "GB");
		System.out.println("Price: " + Samsung.getPrice());
		System.out.println("Quantity: " + Samsung.getQuantity());
		System.out.println("Total Price: " + Samsung.totalPrice);


	}

}
