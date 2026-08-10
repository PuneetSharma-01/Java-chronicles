import java.io.*;
class Account implements Serializable
{
    int num1=10;
    int num2=20;
}
public class SerializableDeserializable
{
    public static void main(String[] args) throws Exception{
        Account a1= new Account();
        System.out.println("Serialization Started");
        FileOutputStream fos=new FileOutputStream("Account.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        System.out.println("Serialization Ended");
        oos.close();
        fos.close();
        System.out.println("Deserialization Started");

        FileInputStream fis = new FileInputStream("Account.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Account a2= (Account)ois.readObject();

        System.out.println("Deserialization Ended");
        System.out.println(a2.num1+"...."+a2.num2);

        ois.close();
        fis.close();
    }
}
