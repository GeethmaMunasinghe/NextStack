//Custom exception
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class Demo7 {
    public static void main(String[] args) {
        System.out.println("start main");
        try {
            A();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("end main");
    }

    private static void A() throws MyException //Exception
    {
        try {
            int x=10/0;

        }catch (Exception e){
            throw new MyException("This is my second exception");
        }
    }
}
