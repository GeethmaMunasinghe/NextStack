class MyClass2  {
    int a;
    MyClass2(int a) {
        this.a=a;
    }
    protected void finalize(){ //object            //final,finalize,finally ->
        System.out.println("mama awa kala giya :"+a);
    }
}



public class Demo2 {
    public static void main(String[] args) {
        System.out.println("start main");
        MyClass2 mc1= new MyClass2(10);
        //MyClass2 mc2= new MyClass2(20);
        mc1=new MyClass2(20);
        mc1=new MyClass2(30);
        System.gc();


        System.out.println("end main");
    }
}
