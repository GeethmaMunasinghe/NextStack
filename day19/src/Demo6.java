interface Greeting{//functional interface
    void sayHello();
}

public class Demo6 {
    public static void main(String[] args) {/*
        Greeting g=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world.");
            }
        };
        g.sayHello();*/
        Greeting g=()-> System.out.println("Hello...");
        g.sayHello();

    }
}
