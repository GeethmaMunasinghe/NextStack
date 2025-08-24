class MyClass{
    int a;
    MyClass(int a){
        this.a=a;
    }
    //long []arr=new long[120000];
    protected void finalize(){
        System.out.println("Hello "+a);
    }

}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Start main.");
        /*MyClass myClassArr[]=new MyClass[120000];
        for (int i=0;i<120000;i++){
            System.out.println(i);
            myClassArr[i]=new MyClass();//120000
        }*/
        MyClass mc=new MyClass(10);
        //mc=null;
        MyClass mc2=new MyClass(20);
        mc=new MyClass(30);
        System.gc();
        /*new MyClass();
        new MyClass();
        System.gc(); //garbage collector
        Runtime.getRuntime().gc();//garbage collector
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
        System.out.println("End main");
    }
}
