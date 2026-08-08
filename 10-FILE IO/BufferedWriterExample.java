import java.io.*;

public class BufferedWriterExample {
    public static void main(String []args) throws IOException{
        FileWriter fab1= new FileWriter("Cricket.txt");
        BufferedWriter bub1= new BufferedWriter(fab1);
        bub1.write("Virat Kohli");
        bub1.newLine();
        bub1.write("Rohit Sharma");
        bub1.flush();
        bub1.close();
    }
    
}
