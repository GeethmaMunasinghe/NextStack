public class Example03 {
    int x=100;
    static int y=200;

    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(Example03.y);

        //System.out.println(x);  ---> cannot do
        Example03 e=new Example03();
        System.out.println(e.x);
        System.out.println(e.y);
    }
}
