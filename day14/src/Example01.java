class A{
        A(){
            System.out.println("super constructor");
        }
}

class B extends A{
    //super();
}
class Example01{
        public static void main(String[] args) {
            new B();//anonymous  obj
        }
}

