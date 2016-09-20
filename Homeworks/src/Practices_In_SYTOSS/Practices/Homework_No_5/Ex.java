package Practices_In_SYTOSS.Practices.Homework_No_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String pattern = "[a-zA-Z]+";
        ArrayList<String> strArr = new ArrayList<>();
        System.out.println("You just entered: \"" + input + "\"");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        System.out.print("Here are normal words: ");
        String output;
        while (m.find()) {
            int startPos = m.start();
            int endPos = m.end();
            output = input.substring(startPos, endPos) + ", ";
            strArr.add(output);
        }

        for (int i = 0; i < strArr.size(); i++) {
            if (i == (strArr.size() - 1)) {
                strArr.set(i, strArr.get(i).replace(",", "."));
            }
            System.out.print(strArr.get(i));
        }
    }
}