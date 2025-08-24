/*class MyClass{


}*/
class SayHelloClass extends Thread{
    /*public void sayHello(){
        for (int i=0;i<10;i++){
            System.out.println("hello");
        }
    }*/
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
class SayHiClass extends Thread{
    /*public void sayHi(){
        for (int i=0;i<10;i++){
            System.out.println("hi");
        }
    }*/
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
public class Demo1 {
    public static void main(String[] args) {
       /* long start=System.currentTimeMillis();
        MyClass myClass=new MyClass();
        myClass.sayHi();
        myClass.sayHello();
        long end=System.currentTimeMillis();

        System.out.println(end-start);*/

        SayHelloClass sayHelloClass=new SayHelloClass();
        SayHiClass sayHiClass=new SayHiClass();
        /*sayHelloClass.run();
        sayHiClass.run();*/
        sayHiClass.start();
        sayHelloClass.start();

    }
}
