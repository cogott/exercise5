import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class palindrome {
    public static void main(String[] args)throws IOException {
        String str, reverse= "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a string");
        str = br.readLine();

        int lenght = str.length();
        for (int i = lenght -1; i>=0; i--)
            reverse = reverse + str.charAt(i);

        if(str.equals(reverse))
        System.out.println(str + "is a palindrome");
        else
            System.out.println(str + "is not a palindrome");

    }
}
