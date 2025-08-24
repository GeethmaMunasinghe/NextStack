class MyClass3  {
    int a;
    MyClass3(int a) {
        this.a=a;
    }
    protected void finalize(){ //object            //final,finalize,finally ->
        System.out.println("mama awa kala giya :"+a);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("start main");
        m();
        System.gc();


        System.out.println("end main");
    }
    static void m(){
        System.out.println("m start");
        MyClass3 m = new MyClass3(10);
        MyClass3 m2 = new MyClass3(20);
        MyClass3 m3 = new MyClass3(30);
        System.out.println("m end");
    }
}

