class A2{
    static {
        System.out.println("Static block A");
    }
}
class B2 extends A2{
    static {
        System.out.println("Static block B");
    }
}
class C2 extends B2{
    static {
        System.out.println("Static block C");
    }
}
class D2 extends B2{
    static {
        System.out.println("Static block D");
    }
}
public class Example06 {
    public static void main(String[] args) {
        new D2();

    }
}
