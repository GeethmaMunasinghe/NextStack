

class A2{
        A2(){
            System.out.println("()");
        }
        A2(int a){
            System.out.println("A(int a)");
        }
        A2(int a,int b){
            System.out.println("A(int a,int b)");
        }
        A2(int a,int b,int c){
            System.out.println("A(int a,int b,int c)");//overloading
        }
}

class B2 extends A2{
        int b;
        B2(){
            System.out.println("B()");
        }
        B2(int b){
            System.out.println("B(int a)");
        }
        B2(int a,int b){
            System.out.println("B(int a,int b)");
        }
        B2(int a,int b,int c){
            super();
            System.out.println("B(int a,int b,int c)");
        }
}
class Example02{
    public static void main(String[] args) {

            new B2(10,20,30);
    }
}

