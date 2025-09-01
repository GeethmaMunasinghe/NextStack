import java.util.StringTokenizer;

public class Demo6 {
    public static void main(String[] args) {
        //StringTokenizer st=new StringTokenizer("Hello World");
        StringTokenizer st=new StringTokenizer("Hello,World",",");


        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
