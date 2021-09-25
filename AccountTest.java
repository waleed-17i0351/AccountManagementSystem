import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;


class AccountTest {

	private Account account1 = new Account(1111, 1000, "03001111111", "Acc1Name", "Acc1Address" , "c", "1/1/1111");
	private Account account2 = new Account(2222, 2000, "03002222222", "Acc2Name", "Acc2Address" , "c", "2/2/2222");
	private Account account3 = new Account(3333, 300000, "03003333333", "Acc3Name", "Acc3Address" , "c", "3/3/3333");
	
	
	@BeforeAll
	public static void setUp() {
		/*account[0].address =   "addressAccount1";
		account[0].balance =     1000;
		account[0].dateCreated = "1/1/2000";
		account[0].id =          1111;
		account[0].name =        "nameAccount1";
		account[0].type =        "p";
		*/
		
		System.out.println("ddddd");
		
		/*account[1].address = "addressAccount2";
		account[1].balance = 2000;
		account[1].dateCreated = "2/2/2000";
		account[1].id = 2222;
		account[1].name = "nameAccount2";
		account[1].type = "p";  */
	}
	
	@Test
	void TestmakeDepositPositive() {
		int deposit = 1000;
		int expectedResult = 2000;
		int result = account1.makeDeposit(deposit);
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	void TestmakeDepositNegative() {
		int deposit = 500;
		int expectedResult = 2000;
		int result = account1.makeDeposit(deposit);
		Assertions.assertFalse(expectedResult == result);
	}
	
	@Test
	void TestmakeWithdrawalPositive() {
		int wd = 500;
		int expectedResult = 500;
		int result = account1.makeWithdrawal(wd);
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	void TestmakeWithdrawalNegative() {
		int wd = 500;
		int expectedResult = 0;
		int result = account1.makeWithdrawal(wd);
		Assertions.assertFalse(expectedResult == result);
	}
	
	@Test
	void TesttransferAmountPositive() {
		int amount = 1000;
		account1.transferAmount(account1, account2, amount);
		int expectedResultA = 0;
		int expectedResultB = 3000;
		
		int resultA = account1.balance;
		int resultB = account2.balance;
		
		Assertions.assertEquals(expectedResultA, resultA);
		Assertions.assertEquals(expectedResultB, resultB);

	}
	
	@Test
	void TesttransferAmountNegative() {
		int amount = 500;
		account1.transferAmount(account1, account2, amount);
		int expectedResultA = 1000;
		int expectedResultB = 2000;
		
		int resultA = account1.balance;
		int resultB = account2.balance;
		
		Assertions.assertFalse(expectedResultA == resultA);
		Assertions.assertFalse(expectedResultB == resultB);
	}
	
	@Test
	void TestcalculateZakatPositive() {
		int result = account3.calculateZakat();
		int expectedResult = 7500;
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	void TestcalculateZakatNegative() {
		int result = account3.calculateZakat();
		int expectedResult = 5700;
		Assertions.assertFalse(expectedResult == result);
	}

}
