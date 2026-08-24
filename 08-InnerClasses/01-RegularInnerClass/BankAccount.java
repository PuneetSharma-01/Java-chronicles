public class BankAccount {
    class Account 
    {
        int accNo;
        double balance;
        public void Accountdetails(int AccNo, double balance)
        {
            this.accNo=AccNo;
            this.balance=balance;
            System.out.println("You have "+this.balance+ " in this Account");
            System.out.println(this.accNo);
        }
    }
    public static void main(String[] args) {
        {
            BankAccount A1=new BankAccount();
            BankAccount.Account B1 = A1.new Account();
            B1.Accountdetails(14321107,200000);
        }
    }
    
}
