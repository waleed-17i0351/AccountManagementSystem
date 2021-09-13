public class Account {
	int id, balance;
	String ph, name, address, type, dateCreated;
	
	Account(){
		id = 0000;
		balance = 0;
		ph = null;
		name = null;
		address = null;
		type = null;
		dateCreated = null;
	}
	
	public void makeDeposit(int money){
		this.balance += money;
	}
	
	public void makeWithdrawal(int money) {
		if (this.type == "s"){
			if (this.balance - money < 0) {
				System.out.println("Not enough money.");
			}
			else {
				this.balance -= money;
			}
		}
		
		if (this.type == "c"){
			if (this.balance - money < -5000) {
				System.out.println("Not enough money.");
			}
			else {
				this.balance -= money;
			}
		}
	}
	public void checkBalance() {
		System.out.println("Name:    " + this.name);
		System.out.println("Balance: " + this.balance + " Rs.");
	}
	public void printStatement() {
		
	}
	public void transferAmount(Account sender, Account receiver, int money) {
		if ((sender.type == "s") && (sender.balance - money > 0)) {
			receiver.balance += money;
		}
		else if ((sender.type == "c") && (sender.balance - money > -5000)) {
			receiver.balance += money;
		}
		
	}
	public int calculateZakat() {
		if (this.balance < 20000) {
			return 0;
		}
		int zakat = (int) Math.round((this.balance*2.5)/100);
		return zakat;
	}
	public void displayAllDeductions() {
		System.out.println("Deducted for zakat: " + this.calculateZakat() + " Rs.");
	}
	
};
