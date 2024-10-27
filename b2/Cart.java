package b2;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	public final int MAX_LIMIT = 20;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	    if (qtyOrdered < MAX_LIMIT) {
	        itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered++;
	        System.out.println("The disc has been added.");
	        
	        if (qtyOrdered == MAX_LIMIT) {
	            System.out.println("The cart is now full.");
	        }
	    } else {
	        System.out.println("The cart is already full. Cannot add more items.");
	    }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean find = false;
		for(int i = 0; i < qtyOrdered;i++) {
			if(itemsOrdered[i] == disc) {
				find = true;
				for(int j = i; j < qtyOrdered;j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered--;
				System.out.println("The disc has been removed.");
			}
			if(find == false) {
				System.out.println("The disc was not found in the cart.");
			}
		}
	}
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0;i < qtyOrdered;i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
}


