import java.util.Arrays;

enum Months7 {//1.5->ENUM-->ENUMERATIONS
    JANUARY(1,"1st month"),
    FEBRUARY(2,"2nd month"),
    MARCH(3,"3rd month"),
    APRIL(4,"4th month"),
    MAY(5,"5th month"),;
    final String name;
    final int number;
    Months(int number, String name) {
        this.name=name;
        this.number = number;
    }

}
public class Demo7 {
    public static void main(String[] args) {
        System.out.println(Months.valueOf("JANUARY"));

        Months months[]=Months.values();



    }

}

