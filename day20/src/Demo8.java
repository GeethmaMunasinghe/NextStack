import java.util.Arrays;

enum Months {//1.5->ENUM-->ENUMERATIONS
    JANUARY(1,"1st month"),//final static
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
public class Demo8 {
    public static void main(String[] args) {

        System.out.println(check(Months.FEBRUARY));

    }
    public static int check(Months month) {
        switch (month) {
            case JANUARY:return month.number;
            case FEBRUARY:return month.number;
            case MARCH:return month.number;
            case APRIL:return month.number;
            case MAY:return month.number;
            default:return 0;

        }
    }

}
