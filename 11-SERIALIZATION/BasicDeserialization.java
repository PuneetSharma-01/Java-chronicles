import java.io.*;

class Account implements Serializable{
    int num1=10;
    int num2=20;
}
public class BasicDeserialization {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Deserialization Started");

        FileInputStream fis = new FileInputStream("Account.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Account a1 = (Account) ois.readObject();

        System.out.println("Deserialization Ended");

        ois.close();
        fis.close();
    }
}