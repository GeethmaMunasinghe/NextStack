public class Demo3 {
    public static void main(String[] args) {
        String name="Beliatta";
        String city="Beliatta";

        System.out.println(name);
        System.out.println(city);
        name=name.concat(" Mr");
        //name.concat("Mr"); //not change -->String are immutable
        System.out.println(name);
    }
}
