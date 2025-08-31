public class Demo1 {
    public static void main(String[] args) {
        System.out.println(calculate());
        System.out.println(calculate(10));
        System.out.println(calculate(10,20));
        System.out.println(calculate(10,20,30,40,50));

    }
    public static int calculate(int... numbers){
        int total=0;
        for (int i=0;i<numbers.length;i++){
            total+=numbers[i];
        }
        return total;
    }
}
