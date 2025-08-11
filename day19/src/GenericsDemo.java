class PrintInfo<T>{
    T data;
    PrintInfo(T data){
        this.data=data;
    }
    public void print(){
        System.out.println(data);
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        PrintInfo<Integer> printInfo=new PrintInfo<Integer>(10);
        PrintInfo<Double> printDouble=new PrintInfo<>(10.7);
        printInfo.print();
        printDouble.print();
    }
}
