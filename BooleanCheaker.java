public class BooleanCheaker {
    public static boolean isEven (int num){
        return num % 2 == 0;
    }
    public static void main(String[]args){
        int number = 6;
        if(isEven(number)){
            System.out.println(number + "is even");

        }else {
            System.out.println(number + "is old");
        }
    }
    
}
