class Box01{
    int length;
    int width;
    int height;
    public  void printBox(){
        int vol=length*width*height;//(l*w)*height
        System.out.println("Volume is :"+vol);//
    }
    public void setSize(int length,int width,int height){
        width=width;
        length=length;
        height=height;
    }

}
public class Example02 {


        public static void main(String[] args) {
            Box01 box=new Box01();
            box.setSize(10,5,2);
            box.printBox();

        }

}
