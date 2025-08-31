//Exception propagation
public class Demo5 {//default exception handler
    public static void main(String[] args) {
        System.out.println("start main");//1
        try {
            A();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("end main");//8
    }

    private static void A() throws ArithmeticException{
        System.out.println("start A");//2
        B();
        System.out.println("end A");//7
    }

    private static void B() throws ArithmeticException{
        System.out.println("start B");//3
        C();
        System.out.println("end B");//6
    }

    private static void C() throws ArithmeticException{
        System.out.println("start C");//4
        int x=10/0;
        System.out.println("end C");//5
    }
}
