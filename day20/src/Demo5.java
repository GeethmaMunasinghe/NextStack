
enum Months5 {//1.5->ENUM-->ENUMERATIONS
    JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5);//object
    int number;
    Months5(int number) {
        this.number = number;
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Months5 month=Months5.FEBRUARY;
        System.out.println(month);
        System.out.println(month.number);
    }

}

