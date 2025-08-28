class Parent{

}
class SayHelloClass2 extends Parent implements Runnable{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
        }
    }
}
class SayHiClass2 extends Parent implements Runnable{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {

        SayHelloClass2 sayHelloClass2=new SayHelloClass2();
        SayHiClass2 sayHiClass2=new SayHiClass2();

        Thread t1=new Thread(sayHiClass2);
        Thread t2=new Thread(sayHelloClass2);

        t1.start();
        t2.start();

    }
}
