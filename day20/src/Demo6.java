import java.util.Arrays;

enum Months {//1.5->ENUM-->ENUMERATIONS
    JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5);//object
    final int number;
    Months(int number) {
        this.number = number;
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println(Months.valueOf("JANUARY"));

        Months months[]=Months.values();
        System.out.println(Arrays.toString(months));


    }

}
public class Demo6 {
}
