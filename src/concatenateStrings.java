import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class concatenateStrings {
    public static void main (String[] args)throws IOException {
        String string1, string2;
        BufferedReader Scanner= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first String");
        string1 = Scanner.readLine();
        System.out.println();//Skip a line
        System.out.println("Enter the second String");
        string2 = Scanner.readLine();
        System.out.println();

        StringBuilder string3= new StringBuilder(string1);
        string3.append(string2);
        System.out.println("Concatenated string: " + string3);

        System.out.println("Concatenate String: " + string1.concat(string2));

    }
}
