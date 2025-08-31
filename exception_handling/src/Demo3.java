public class Demo3 {
    public static void main(String[] args) {
        System.out.println("start main");

        try {
            // int y=10/0;
            int x = 10 / 2;
            int arr[] = new int[2];
            arr[10] = 20;
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
       /* catch (ArithmeticException ex){
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException out){
            out.printStackTrace();
        }*/
        System.out.println("end main");
    }
}
