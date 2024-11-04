package Functions;

public class stringExample {
    public static void main(String[] args) {
        String massage = greet();
        System.out.println(massage);
        int ans = sum(20,30);
        System.out.println(ans);
        
    }
//  RETURN STRING
    static String greet(){
        String greeting = "Hay! GOOD MORNING";
        return greeting;
    }

//    PASS THE VALUE FROM FROM MAIN FUNCTION
        static int sum(int a, int b){
         int result = a+b;
         return result;
        }
}
