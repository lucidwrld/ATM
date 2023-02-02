import java.util.Scanner;
public class Atm{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String name, bank;
		int pin, acct_no, number, amount, new_bal, acct_type, balance, trans, numbr;
		System.out.print("Enter your name \n");
		name = s.nextLine();
		System.out.print("Enter your pin \n");
		pin = s.nextInt();
		if(pin == 1234 || pin == 2314 || pin == 3241 || pin == 4321){
			System.out.print("Enter your account balance \n ");
			balance = s.nextInt();
			System.out.print("Press '1' for withdrawal \t '2' for transfer \t '3' to buy airtime \t '4'' to show account balance \n");
			trans = s.nextInt();
			switch(trans){
				case 1:
				System.out.print("Enter the amount your want to withdraw \n");
				amount = s.nextInt();
				if(amount<=balance){
					new_bal= balance-amount;
					System.out.println("You have successfully withdrawn \n");
					System.out.println("Your new balance is "+new_bal);
					}else{
					System.out.println("Insufficient funds");
					}
				break;
				case 2:
					System.out.print("Enter account number \n");
					acct_type = s.nextInt();
					System.out.print("Enter amount to be transferred \n");
					amount = s.nextInt();
					if(amount<=balance){
						new_bal=balance-amount;
						System.out.println("You have successfully transferred \n");
						System.out.println("your new balance is "+new_bal);
					}else{
					System.out.println("Insufficient funds");
					}
				break;
				case 3:
					System.out.print("Enter your phone number \n");
					acct_type = s.nextInt();
					System.out.print("Enter amount of airtime to be brought \n");
					amount = s.nextInt();
					if(amount<=balance){
						new_bal=balance-amount;
						System.out.println("You have successfully brought airtime \n");
						System.out.println("your new balance is "+new_bal);
					}else{
					System.out.println("Insufficient funds");
					}
				break;
				case 4:
					System.out.println("Your balance" +balance);
			}
		}else{
			System.out.println("Incorrect pin");
		}
	}
}