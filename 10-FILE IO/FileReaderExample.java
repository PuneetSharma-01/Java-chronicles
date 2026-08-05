import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws IOException{
        FileReader fab1= new FileReader("Cricket.txt");
        int i=fab1.read(); //more amount of data
        while(i!=-1)
        {
            System.out.println((char)i);
            i=fab1.read() ;
        }
        fab1.close();
    }
}
