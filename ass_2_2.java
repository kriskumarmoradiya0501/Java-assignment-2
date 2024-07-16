public class ass_2_2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int num = number;
        int sum = 0;
        while(num != 0) {
            int remainder = num % 10;
            if(remainder%2==0){
                sum+=remainder;
            }
            num /= 10;
        }
        System.out.println(sum);

    }
}
