import java.io.*;
import java.util.Scanner;


public class Test {

    static String fileName = "F:\\Programs\\Projects\\java\\lab6\\src\\test.txt";
    static byte key_sign = 7;
    static File file;
    static FileReader fr;

    public static void main(String args[]) throws FileNotFoundException {
        try {

            //String s = "possible result is: 123";
            String s=input();

            coder_writer(s);
            decoder_reader(file,fr);


            } catch (Exception e) {
                System.out.println(e);
            }

    }

    private static String input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        String num = scan.nextLine();
        scan.close();
        return num;
    }

    private static void coder_writer(String str) throws IOException {
        FileOutputStream fout = new FileOutputStream(fileName);
        byte b[] = str.getBytes();

        for (int i = 0; i < b.length; i++) {
            b[i]+=key_sign;
        }

        fout.write(b);
        fout.close();
    }

    private static void decoder_reader(File file, FileReader fr) throws IOException {

        fr = new FileReader(fileName);
        file = new File(fileName);
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[(int) file.length()];
        try {
            //convert file into array of bytes
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
            for (int i = 0; i < bFile.length; i++) {
                bFile[i] -= key_sign;
                System.out.print((char) bFile[i]);
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}