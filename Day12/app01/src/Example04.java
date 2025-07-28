public class Example04 {
    public void instanceMethod(){
        System.out.println("Instance Method");
    }
    public static void staticMethod(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        staticMethod();
        Example04.staticMethod();
        //instanceMethod(); --->error
        //Example04.instanceMethod(); --->error

        Example04 e04=new Example04();
        e04.instanceMethod();
        e04.staticMethod();

    }
}
