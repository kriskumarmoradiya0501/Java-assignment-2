public class ass_2_1 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        if(n1>n2 && n1>n3){
            System.out.println(n1+" is Max number.");
        }
        else if(n2>n3){
            System.out.println(n2+" is max number");
        }
        else{
            System.out.println(n3+" is max number");
        }
    }
}
