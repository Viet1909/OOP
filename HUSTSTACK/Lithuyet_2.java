package b1;

class BankAccount{
	private String owner;
	private double balance;
	public BankAccount() {
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String returnOwner() {
		return owner;
	}
}

public class Lithuyet_2 {
	public static void main(String args[]) {
		BankAccount account1= new BankAccount();
		account1.setOwner("Hoa");
		System.out.print("Nguoi dung ten la:" + account1.returnOwner());
	}
}
