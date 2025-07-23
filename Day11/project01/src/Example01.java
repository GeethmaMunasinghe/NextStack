import java.util.Arrays;
class Box{
    int length;
    int width;
    int height;

    public  void printBox(){
        int vol=length*width*height;
        System.out.println("Volume is :"+vol);//
    }
}
public class Example01 {

        public static void main(String[] args) {
            Box box=new Box();
            box.width=12;
            box.height=5;
            box.length=10;
            box.printBox();



        }
}
