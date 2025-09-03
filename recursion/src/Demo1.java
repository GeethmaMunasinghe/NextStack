public class Demo1 {
    public static void main(String[] args) {
        int result=m3(5);
        System.out.println(result);
    }

    private static int m3(int n) {
        if (n<0) throw new IllegalArgumentException("N must be positive number");
        if (n<=1) return 1;

        int i=n;
        int answer=n;
        while (i>1){
            answer = answer* --i;
        }
        return answer;
    }
}
