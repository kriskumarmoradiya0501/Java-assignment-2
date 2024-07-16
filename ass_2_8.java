public class ass_2_8 {
    public static void main(String[] args) {
        String user = "Krish";
        String pass = "Krish00";

        String username = args[0];
        String password = args[1];

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
