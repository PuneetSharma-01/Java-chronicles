import java.io.*;
public class FileWriterExample{
    public static void main(String[]args) throws IOException
    {
        FileWriter fw= new FileWriter("Account.txt");
        fw.write(67);//Added Single Character
        fw.write("Puneet Sharma\n Contact for Coaching Practice");
        fw.write("\n");
        char[] chem={'a','b','c'};
        fw.write(chem);

        fw.close();
        System.out.println("Data Written Succesfully");
    }
}
