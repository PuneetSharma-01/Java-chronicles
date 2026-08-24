public class BankAccount
{
    public void showaccountdetail()
    {
        class Account
        {
            double balance;
            public void getbalance(double balance)
            {
                this.balance=balance;
                System.out.println("Balance.."+this.balance);
            }
        }
        Account a = new Account();
        a.getbalance(50000);
    }
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.showaccountdetail();
    }
}