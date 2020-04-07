import java.io.*;
import java.util.Scanner;


public class Test {

    static String fileName = "F:\\Programs\\Projects\\java\\lab6\\src\\test.txt";
    static byte key_sign = 7;

    public static void main(String args[]) throws FileNotFoundException {
        try {

            //String s = "possible result is: 123";
            String s=input();

            writer(s);
            reader(file);


            } catch (Exception e) {
                System.out.println(e);
            }

    }

    private static String input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String num = scan.nextLine();
        scan.close();
        return num;
    }

    public static byte[] coder(String str){
        byte b[] = str.getBytes();

        for (int i = 0; i < b.length; i++) {
            b[i]+=key_sign;
        }
        return b;
    }
    
    private static void writer(String str) throws IOException {
        FileOutputStream fout = new FileOutputStream(fileName);
  
        fout.write(b);
        fout.close();
    }
    
    public static String decoder(byte[] bytes){

        String str="";
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= key_sign;
            System.out.print((char) bytes[i]);
            str+=(char) bytes[i];
        }

        return str;
    }
    
    private static void decoder_reader() throws IOException {

        File file = new File(fileName);
        byte[] bFile = new byte[(int) file.length()];
        try {
            
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
            
            decoder(bFile);
            
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
