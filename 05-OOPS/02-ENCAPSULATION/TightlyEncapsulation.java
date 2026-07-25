public class TightlyEncapsulation {
 public int balance;
 public void setbalance(int balance)
 {
    this.balance = balance;
 }
 public double getbalance()
 {
    return balance;
 }
 public static void main(String[] args) {
     {
        TightlyEncapsulation Obj1 = new TightlyEncapsulation();
        Obj1.setbalance(123000);
        System.out.println(Obj1.getbalance());
     }
 }
}
