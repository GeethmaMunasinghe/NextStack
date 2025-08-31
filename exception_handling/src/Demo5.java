public class Demo5 {
    public static void main(String[] args) {
        System.out.println("start main");//1
        A();
        System.out.println("end main");//8
    }

    private static void A() {
        System.out.println("start A");//2
        B();
        System.out.println("end A");//7
    }

    private static void B() {
        System.out.println("start B");//3
        C();
        System.out.println("end B");//6
    }

    private static void C() {
        System.out.println("start C");//4
        System.out.println("end C");//5
    }
}
