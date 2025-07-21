
    class Brick{
        int x;
        public void setSize(int length,int width,int height){
            int size=length*width*height;
            System.out.println("size:"+size);
        }
    }

    public class Example01 {
        public static void main(String[] args) {
            Brick b1=  new Brick();
            b1.setSize(10,10,10);

            Brick b2=new Brick();
            b2.setSize(12,5,3);
        }
    }

