import java.io.*;
class Account implements Serializable
{
    String username="Puneet Sharma";
    transient  int password=166678;

    private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();
     int epassword= 123 + password;
     os.writeObject(epassword);
    }
    private void readObject(ObjectInputStream is) throws Exception
    {
     is.defaultReadObject();
     int epassword= (int)is.readObject();
     password = epassword-123;
    }
}
public class CustomizedSerialization
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
        System.out.println(a2.username+"...."+a2.password);

        ois.close();
        fis.close();
    }
}


