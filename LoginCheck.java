public class LoginCheck {
    public static void main(String []args){
        String correctPassword = "admin123";
        String inputPassword = "admin123";


        boolean isLoginSuccessflu = inputPassword.equals(correctPassword);

        if(isLoginSuccessflu){
            System.out.println("Welcome to your dashboard!");

        }else{
            System.out.println("Incorrect password");
        }

    }
}
