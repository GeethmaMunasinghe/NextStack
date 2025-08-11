import java.util.Arrays;

interface Cricketers {

}
class BatsMan implements Cricketers{
    BatsMan(String name){
        System.out.println("Batsman "+name);
    }
}
class Ballers implements Cricketers{
    Ballers(String name){
        System.out.println("Baller "+name);
    }
}
class SLC<T>{
    Object [] team=new Object[11];
    SLC(){

    }
    int count=0;
    public void add(T player){
        team[count++]=player;


    }
    public void announceTeam(){
        System.out.println(Arrays.toString(team));
    }

}
class Demo{
    public static void main(String[] args) {
        Cricketers batsman1=new BatsMan("Kusal M");
        Cricketers batsman2=new BatsMan("Pathum M");

        Cricketers baller1=new Ballers("Binura F");
        Cricketers baller2=new Ballers("Wanidu H");

        SLC<Cricketers> slc=new SLC<>();
        slc.add(batsman1);
        slc.add(batsman2);
        slc.add(baller1);
        slc.add(baller2);

        slc.announceTeam();

    }
}
