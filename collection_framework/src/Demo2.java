public class Demo2 {
    public static void main(String[] args) {
        String s1="geethma"; //literal objects
        String s2=new String("geethma"); //Dynamic objects
        String s3="geethma"; //literal objects
        String s4=new String("geethma"); //Dynamic objects
        String s5="Geethma"; //literal objects

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
    }
}
