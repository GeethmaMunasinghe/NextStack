class Parent3{

}
class SayHelloClass3 extends Parent3 implements Runnable{


    @Override
    public void run() {

    }
}
class SayHiClass3 extends Parent3 implements Runnable{

    public void run(){

    }
}
public class Demo3 {
        public static void main(String[] args) {
            //Using inner class

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<10;i++){
                        System.out.println("hello");
                        try {
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                        }
                    }
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<10;i++){
                        System.out.println("hi");
                        try {
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                        }
                    }
                }
            });

            t1.start();
            t2.start();

        }
}
