import java.util.*;
public class JavaTextApp{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];
        for(;true;){
        System.out.println("Bank Admin Menu : ");
        System.out.println("Please Enter a Menu Option ");
        System.out.println("(1) : Add Customer to a bank ");
        System.out.println("(2) : Change Customer Name  ");
        System.out.println("(3) : Check Account Balance  ");
        System.out.println("(4) : Modify Account Balance  ");
        System.out.println("(5) : Summary of all accounts ");
        System.out.println("(-1) : Quit");
        
        
        System.out.println("User Input : ");
        userInput = input.nextInt();
        if(userInput==1){
            System.out.println("Bank Add Customer Menu : ");
            System.out.println("Please enter an account Balance");
            double balance = input.nextDouble();
            accountBalances[size] = balance ;
            System.out.println("Please Enter the account Holder Name : ");
            input.nextLine();
            String name = input.nextLine();
            accountNames[size] = name;
            System.out.println("customer id is "+ size);
            size = size + 1;
        }
        else if(userInput==2){
            System.out.println("Bank Change Name Menu : ");
            System.out.println("Please Enter a customer Id to change their name : ");
            int index = input.nextInt();
            System.out.println("Whast is the new Name of the customer : ");
            input.hasNextLine();
            accountNames[index] = input.nextLine();

        }
        else if(userInput==3){
            System.out.println("Bank Check Balance Menu :");
            System.out.println("Please Enter a Customer Id to check Balance : ");
            int index = input.nextInt();
            System.out.println("The Balance in "+ accountNames+ "is $" + accountBalances[index] + ". ");
            
        }
        else if(userInput==4){
            System.out.println("Bank Change Account balance Menu : ");
            System.out.println("Enter Customer Id to change account balance of a customer . ");
            int index = input.nextInt();
            System.out.println("The Previous balance of this customer is " + accountBalances[index]);
            System.out.println("Enter New account balance to be updated : ");
            accountBalances[index] = input.nextInt();
            System.out.println("The new balance is " + accountBalances[index]);
            
        }
        else if(userInput==5){
            System.out.println("Bank All Customer Summary Menu : ");
            double total = 0;
            for(int i=0;i<size ; i++){
                total = total + accountBalances[i];
                System.out.println(accountNames[i] + " has $ " + accountBalances[i] + " in their accounts . ");
            }
            System.out.println("The total balance in bank is : " + total);
        }
        else if(userInput== -1){
            System.exit(-1);
        }
        else{
            System.out.println("ERROR : Invalid Input  : ");
        }
    }

    }
}
