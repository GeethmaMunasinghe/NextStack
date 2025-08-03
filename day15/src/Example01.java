import java.util.Random;

class Observer{
    public void update(int waterLevel){

    }
}
class Alarm extends Observer{
    String alarmId;
    Alarm(String alarmId){
        this.alarmId=alarmId;
    }
    public void update(int waterLevel){
        System.out.println("Alarm triggered: "+alarmId+(waterLevel>=50?" On":" Off")); //if-else
    }

}

class Display{
    public void showWaterLevel(int waterLevel){
        System.out.println("Water level is: "+waterLevel);
    }
}

class SMSManager{
    public void sendMessage(int waterLevel){
        System.out.println("SMS sending "+waterLevel);
    }
}

class ControlPanel{
    private Alarm alarm; //Has-A relationship
    private Display display;
    private SMSManager smsManager;
    private int waterLevel;
    public void putAlarm(Alarm alarm){
        this.alarm=alarm;
    }
    public void putDisplay(Display display){
        this.display=display;
    }

    public void putSMSmanager(SMSManager smsManager){
        this.smsManager=smsManager;
    }
    /*public void putWaterLevel(int waterLevel){
        this.waterLevel=waterLevel;
    }*/
    public void notifyObjects(){
        alarm.update(waterLevel);
        display.showWaterLevel(waterLevel);
        smsManager.sendMessage(waterLevel);
    }
    public void setDate(int waterLevel){
        if (this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObjects();
        }
    }
}
public class Example01 {
    public static void main(String[] args) {
        ControlPanel controlPanel=new ControlPanel();
        //Alarm alarm=new Alarm("Alarm1");
        controlPanel.putAlarm(new Alarm("Alarm1"));
        controlPanel.putDisplay(new Display());
        controlPanel.putSMSmanager(new SMSManager());

        Random rand=new Random();
        while (true){
            controlPanel.setDate(rand.nextInt(101));
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("---------------**************");
            }
        }
    }
}
