public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Start main");

        try {
            System.out.println("start try");
            int x=10/0;
            System.out.println("end try");
        }catch (Exception e){
            System.out.println("start catch");
            e.printStackTrace();
            System.out.println("end catch");
        }
        System.out.println("End main");
    }
}
