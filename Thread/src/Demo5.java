class ChangeValue{
    int i;
    //int b;

    //method synchronization
    synchronized void increment(){
       /*synchronized (this){  //block synchronization
           b++;
       }*/

        i++;
    }
}
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        ChangeValue changeValue=new ChangeValue();

        Thread t1=new Thread(()->{
            for (int i=0;i<2000;i++){
                changeValue.increment();
            }
        });

        Thread t2=new Thread(()->{
            for (int i=0;i<2000;i++){
                changeValue.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(changeValue.i);
    }
}
