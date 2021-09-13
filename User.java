import java.util.*;
public class User {
	public void RuntheSystem() {
		Account account[]= new Account[50];
		int index = 0;
		int choice = 0;
		while(choice != -1) {
			System.out.println("1) Open new Account");
			System.out.println("2) Close an Account");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Check balance");
			System.out.println("6) Transfer money");
			System.out.println("-1) Exit");
			
			Scanner input = new Scanner(System.in);
		    System.out.println("Enter your choice: ");
		    choice = input.nextInt();  
		    
		    switch(choice) {
			    case 1:
			    	account[index] = new Account();
				    System.out.println("Enter unique ID(number-only): ");
				    int id = input.nextInt();
			    	account[index].id = id;
			    	
			    	System.out.println("Enter Balance: ");
				    int balance = input.nextInt();
			    	account[index].balance = balance;
			    	
			    	System.out.println("Enter Name: ");
				    String name = input.nextLine();
			    	account[index].name = name;
			    	
			    	System.out.println("Enter Phone Number: ");
				    String ph = input.nextLine();
			    	account[index].ph = ph;
			    	
			    	System.out.println("Enter Address: ");
				    String address = input.nextLine();
			    	account[index].address = address;
			    	
			    	System.out.println("Enter Current Date(account creation date): ");
				    String dC = input.nextLine();
			    	account[index].dateCreated = dC;
			    	
			    	System.out.println("Enter Account Type('c' for Checking, 's' for saving): ");
				    String type = input.nextLine();
			    	account[index].type = type;
			    	
			    	index++;
			    	
			    	break;
			    case 2:
			    	System.out.println("Enter unique ID of account you want to delete: ");
			    	int uniqueID = input.nextInt();
			    	int i = 0;
			    	while(i < index) {
			    		if (account[i].id == uniqueID) {
			    			Account tempArr[] = new Account[50];
			    			for (int a = 0, b = 0; a < index ;a++) {
			    				if (a==i) {
			    					continue;
			    				}
			    				tempArr[b++] = account[a];
			    			}
			    			
			    			for (int a = 0; a < index ;a++) {
			    				 account[a] = tempArr[a];
			    			}
			    			break;
			    		}
			    		i += 1;
			    	}
			    	System.out.println("No such ID found in the system. Please enter a valid ID next time.");
			    	break;
			    case 3:
			    	System.out.println("Enter unique ID of account to deposit money in: ");
			    	int ID = input.nextInt();
			    	int ii = 0;
			    	while(ii < index) {
			    		if (account[ii].id == ID) {
			    			System.out.println("Enter the amount of money to deposit: ");
					    	int deposit = input.nextInt();
			    			account[ii].makeDeposit(deposit);
			    			break;
			    		}
			    		ii += 1;
			    	}
			    	System.out.println("No such ID found in the system. Please enter a valid ID next time.");
			    	break;
			    case 4:
			    	System.out.println("Enter unique ID of account to withdraw from: ");
			    	int iD = input.nextInt();
			    	int iii = 0;
			    	while(iii < index) {
			    		if (account[iii].id == iD) {
			    			System.out.println("Enter the amount of money to withdraw: ");
					    	int withdraw = input.nextInt();
			    			account[iii].makeWithdrawal(withdraw);
			    		}
			    		iii += 1;
			    	}
			    	System.out.println("No such ID found in the system. Please enter a valid ID next time.");
			    	break;
			    case 5:
			    	System.out.println("Enter unique ID of account to check balance for: ");
			    	int iiD = input.nextInt();
			    	int iv = 0;
			    	while(iv < index) {
			    		if (account[iv].id == iiD) {
			    			account[iv].checkBalance();
			    		}
			    		iv += 1;
			    	}
			    	System.out.println("No such ID found in the system. Please enter a valid ID next time.");
			    	break;
			    case 6:
			    	System.out.println("Enter unique ID of Sender: ");
			    	int sender = input.nextInt();
			    	int v = 0, moneh = 0;
			    	while(v < index) {
			    		if (account[v].id == sender) {
			    			System.out.println("Enter the amount of money to send: ");
					    	moneh = input.nextInt();
			    			account[v].makeWithdrawal(moneh);
			    		}
			    		v += 1;
			    	}
			    	System.out.println("Enter unique ID of Receiver: ");
			    	int receiver = input.nextInt();
			    	int vi = 0;
			    	while(vi < index) {
			    		if (account[vi].id == receiver) {
			    			account[v].makeDeposit(moneh);
			    			break;
			    		}
			    		v += 1;
			    	}
			    	System.out.println("One or more ID's not found in the system. Please enter a valid ID next time.");
			    	break;
			    default:
			      // code block
		  } 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User Admin= new User();
		Admin.RuntheSystem();
	}

}
