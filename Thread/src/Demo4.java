
public class Demo4 {
    public static void main(String[] args) {
        //Using lambda expression

        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                }
            }
        });
        Thread t2 = new Thread(()-> {
            for (int i=0;i<10;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                }
            }
        });

        t1.start();
        t2.start();

    }
}
