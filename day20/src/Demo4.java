
enum Months{//1.5->ENUM-->ENUMERATIONS
    JANUARY,FEBRUARY,MARCH,APRIL,MAY
}
/*class Months{
    final static String month1="January";
    final static String month2="February";
    final static String month3="March";
    final static String month4="April";
    final static String month5="May";

}*/
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(check(Months.month1));
    }
    public static String check(String month){
        switch (month) {
            case "January":
                return "January";
            case "February":
                return "February";
            case "March":
                return "March";
            case "April":
                return "April";
            case "May":
                return "May";
            default:
                return "Wrong Input";
        }

    }
}
