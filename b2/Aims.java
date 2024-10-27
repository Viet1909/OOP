package b2;



public class Aims {
	public static void main(String args[]) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Ficiton", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost before remove: " + anOrder.totalCost());
		System.out.println("Remove The Lion King");
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("Total cost after remove: " + anOrder.totalCost());
		System.out.println("Remove The Lion King again");
		anOrder.removeDigitalVideoDisc(dvd1);
	}
}
