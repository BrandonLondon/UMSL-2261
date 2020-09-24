import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the Second string: ");
        String s2 = input.nextLine();
        input.close()
        int index = 0;
        String prefix = "";
        while (s1.charAt(index) == s2.charAt(index)) {
            prefix += s1.charAt(index);
            index++;
        }
        if (prefix.length() > 0){
            System.out.println("The common prefix is " + prefix);
        } else {
            System.out.println(s1 + " and " + s2 + "Have no common prefixes");
        }
    }
}
