import java.util.*;

class ATM {
    int UserPin = 7845;
    float Balance;
    int UserId = 4567;
    

    public void checkpin() {
        System.out.println("Enter your PIN: ");
        Scanner scn = new Scanner(System.in);
        int Userpin = scn.nextInt();
        if(Userpin == UserPin) {
            menu();
        } else {
            System.out.println("Enter a valid PIN.");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    Scanner scn = new Scanner(System.in);
    int option = scn.nextInt();
    
    switch(option) {
        case 1: TransactionsHistory();
        break;
        case 2: Withdraw();
        break;
        case 3: Deposit();
        break;
        case 4: Transfer();
        break;
        case 5: System.out.println("Thank you.");
        return;
        default: System.out.println("Invalid Option.");
    }
        
    } 

    public void TransactionsHistory() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void Withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner scn = new Scanner(System.in);
        float amount = scn.nextFloat();
        if(amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Withdrawl Successfully.");
        }
        menu();
    }

    public void Deposit() {
        System.out.println("Enter the Amount: ");
        Scanner scn = new Scanner(System.in);
        int amount = scn.nextInt();
        Balance += amount;
        System.out.println("Money Deposit Successfully.");
        menu();
    }

    public void Transfer() {
        System.out.println("Enter the amount to deposit: ");
        Scanner scn = new Scanner(System.in);
        int amount = scn.nextInt();
        if(amount <= Balance) {
            System.out.println("Enter the recipient's user ID: ");
            String recipient_Id = scn.next();
            Balance -= amount;
            System.out.println("Transfer to " + recipient_Id + " successfully."); 
        } else {
            System.out.println("Insufficient Balance.");
        }
        menu();
        
    }
  public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }

}

    
