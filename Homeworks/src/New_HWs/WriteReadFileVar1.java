package New_HWs;

import java.io.*;

public class WriteReadFileVar1 {
    public static void main(String[] args) throws IOException {

        String content = "This is the content\nof current text file";
        String name1 = "/myTextFile1.txt";
        String name2 = "/myTextFile2.txt";
        myWritingMethod(name1, content);
        myWritingMethod(name2, content);
        myReadingMethod(name1);
        myReadingMethod(name2);
    }

    private static void myWritingMethod(String name, String content) throws IOException {
        File file = new File(name);
        PrintWriter input = new PrintWriter(file);
        if (file.exists()) {
            input.write(content);
            input.close();
        }
    }

    private static void myReadingMethod(String name) throws IOException {
        File file = new File(name);
        FileReader reader = new FileReader(name);
        System.out.println("Content of " + name + ":");
        char letter;
        for (int i = 0; i < file.length(); i++) {
            letter = (char) reader.read();
            System.out.print(letter);
        }
        System.out.println("\n");
    }
}