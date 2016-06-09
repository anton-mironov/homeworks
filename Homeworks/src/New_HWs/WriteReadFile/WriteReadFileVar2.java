package New_HWs.WriteReadFile;

import java.io.*;

public class WriteReadFileVar2 {
    public static void main(String[] args) throws IOException {
        readBytesInput();
        readFileInput();
    }

    public static void readBytesInput() throws IOException {
        String content = "This is the content of \"myTextFile\" red by bytes and written into array";
        InputStream inputStream = new ByteArrayInputStream(content.getBytes());
        byte[] output = new byte[content.length()];
        System.out.println("Reading in bytes:");
        print(inputStream, output);
    }

    public static void readFileInput() throws IOException {
        InputStream inputStream = new FileInputStream("/myTextFile1.txt");
        byte[] output = new byte[inputStream.available()];
        System.out.println("\nReading from file:");
        print(inputStream, output);
    }

    private static void print(InputStream inputStream, byte[] output) throws IOException {
        inputStream.read(output);
        System.out.println(new String(output));
    }
}