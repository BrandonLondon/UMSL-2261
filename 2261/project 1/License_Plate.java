public class License_Plate {
    public static void main(String[] args) {
        System.out.println("Here are your ten random license plates: \n");
        for (int i = 1; i <= 10; i++) {
            int letter1 = 65 + (int) (Math.random() * (90 - 65));
            int letter2 = 65 + (int) (Math.random() * (90 - 65));
            int letter3 = 65 + (int) (Math.random() * (90 - 65));
            int letter4 = 65 + (int) (Math.random() * (90 - 65));
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            System.out.println("" + (char) (letter1) + ((char) (letter2)) + (number1) + "-" + (char) (letter3) + number2 + (char) (letter4));
        }
        
    }
}
