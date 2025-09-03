public class Demo2 {
    public static void main(String[] args) {
        int result=m4(5); //caller
        System.out.println(result);
    }

    private static int m4(int n) {
        if (n==1) return 1; //stopping condition

        return n*m4(n-1); //recursive caller
    }
}
