public class InsufficientBalanceException extends Exception {
    public static void main(String[] args)
    {
        BankAccount BA= new BankAccount();
        try{
        BA.withdraw(12000);
        }
        catch(InsufficientBalanceException ie)
        {
            System.out.println("insufficient Balance");
        }
    }
}
class BankAccount 
{
    int amount;
    int balance=10000;
    public void withdraw(int amount) throws InsufficientBalanceException
    {
        this.amount=amount;
        if(amount<=balance)
        {
         System.out.println("Money is Credited");
        }
        else{
            throw new InsufficientBalanceException();
        }
    }

}
