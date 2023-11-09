package ExceptionHandlind;

public class Application {
    public static void main(String[] args) {

        int numerator = 5;
        int denominator = 0;

        try{
            System.out.println(numerator/denominator);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always executed no matter what!");
        }
    }
}
