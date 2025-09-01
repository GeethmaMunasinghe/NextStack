class Increment{
    int i;
    synchronized void changeValue(){
        i++;
    }
}
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        Increment increment=new Increment();
        Thread t1=new Thread(()->{
            for (int i=0;i<1000;i++){
                increment.changeValue();
            }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<1000;i++){
                increment.changeValue();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(increment.i);
    }
}
