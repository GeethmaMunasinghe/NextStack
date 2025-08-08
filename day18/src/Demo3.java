interface Phone{
    void call();
}
/*interface Internet{
    void browsing();
}
class Camera{
    public void takePhoto(){

    }
}
class Iphone5s extends Camera implements Phone,Internet{

    @Override
    public void call() {

    }

    @Override
    public void browsing() {

    }
}*/
public class Demo3 {
    public static void main(String[] args) {
        //Phone v1=new Phone() ;// Can not create objects
        Phone v1=null;
        v1.call();
    }
}
