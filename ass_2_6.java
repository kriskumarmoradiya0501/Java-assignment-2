
public class ass_2_6 {
    public static void main(String[] args){
        String number = args[0];

        if (number.length() < 2) {
            System.out.println("The number should have at least two digits.");
        } else {
            char firstDigit = number.charAt(0);
            char secondDigit = number.charAt(1);
            System.out.println("First digit: " + firstDigit);
            System.out.println("Second digit: " + secondDigit);
        }
    }
}
