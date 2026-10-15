## CIMB with Decorator Pattern

CIMB is a digital bank that offers GSave and UpSave savings accounts.<br>
As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.<br>
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.<br>
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.<br>
Benefits include the "Standard Savings Account" plus "with Insurance".

Develop a decorator pattern approach that will implement the given UML diagram.

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :



```
public class Cimb {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount();
		
		account.setAccountNumber(1234);
		account.setAccountName("Juan Dela Cruz");
		account.setBalance(10000.0);
		
		System.out.println(account.showInfo());
		System.out.println("Account type: " + account.showAccountType());
		System.out.println("Interest rate: " + account.getInterestRate());
		System.out.println("New balance: " + account.computeBalanceWithInterest());
		System.out.println("Benefits: " + account.showBenefits());
		
		System.out.println("----------------------");
		
		GSave gSave = new GSave(account);
		System.out.println(gSave.showInfo());
		System.out.println("Account type: " + gSave.showAccountType());
		System.out.println("Interest rate: " + gSave.getInterestRate());
		System.out.println("New balance: " + gSave.computeBalanceWithInterest());
		System.out.println("Benefits: " + gSave.showBenefits());
		
		System.out.println("----------------------");
		
		UpSave upSave = new UpSave(account);
		System.out.println(upSave.showInfo());
		System.out.println("Account type: " + upSave.showAccountType());
		System.out.println("Interest rate: " + upSave.getInterestRate());
		System.out.println("New balance: " + upSave.computeBalanceWithInterest());
		System.out.println("Benefits: " + upSave.showBenefits());
	}
}
```

Description of the following methods:
<ol>
<li>showAccountType() - Either returns "Savings Account", "GSave" or "UpSave"</li>
<li>getInterestRate() - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave</li>
<li>getBalance() - Returns the balance of the account set.</li>
<li>showBenefits() - Either returns "Standard Savings Account" for Savings Account;<br>
		&nbsp;&nbsp;&nbsp;&nbsp;benefits offered by savings account + "GSave Transfer";<br>
    &nbsp;&nbsp;&nbsp;&nbsp;benefits offered by savings account + "With Insurance";</li>
<li>computeBalanceWithInterest() - returns new balance by computing the balance plus the interest depending on the interest rate.</li>
<li>showInfo() - Returns details of account number, account name, and balance.</li>
</ol>

BankAcountDecorator must be an interface.
<br><br>
Follow instructions.  You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).
