import java.io.*;
class Account implements Serializable
{
   private  
   int num1=10;
   int num2=20;
}
public class BasicSerialization {
    public static void main(String [] args) throws Exception
    {
     Account a1= new Account();
     System.out.println("Serialization Started");
     FileOutputStream fos=new FileOutputStream("Account.ser");
     ObjectOutputStream oos= new ObjectOutputStream(fos);
     oos.writeObject(a1);
     System.out.println("Serialization Ended");
     oos.close();
     fos.close();
    }
    
}
