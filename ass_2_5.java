public class ass_2_5 {
    public static void main(String[] args) {
        String binaryString = args[0];

        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("Binary number: " + binaryString);
        System.out.println("Decimal number: " + decimal);

    }
}
