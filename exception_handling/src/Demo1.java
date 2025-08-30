public class Demo1 {
    public static void main(String[] args) {
        System.out.println("start main...");
        try {
            int x=10/0;

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("end main...");
    }
}
