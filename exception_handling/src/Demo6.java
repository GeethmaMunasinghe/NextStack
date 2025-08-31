import java.sql.Connection;
import java.sql.DriverManager;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("start main");
        try {
            A();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("end main");
    }

    private static void A() throws Exception{
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","1234");

        }catch (Exception e){
            throw new Exception("exception created");
        }

    }
}
