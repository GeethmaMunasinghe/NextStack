public class Demo4 {
    public static void main(String[] args) {
        String str1="Geethma@";

        str1=str1.replace('@','#');
        System.out.println(str1);

        System.out.println(str1.startsWith("G"));
        System.out.println(str1.startsWith("Gee"));
        System.out.println(str1.startsWith("Gi"));

    }
}
