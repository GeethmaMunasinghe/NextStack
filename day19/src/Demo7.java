interface Vehicle{
    String park(int num);
}
public class Demo7 {
    public static void main(String[] args) {
        /*Vehicle car=(int num)-> System.out.println("Car park"+num);
        car.park(10);*/


/*
        Vehicle bike=(int num)-> System.out.println("Bike park"+num);
        bike.park(20);*/
        Vehicle  car=(int num)-> {
            System.out.println("Car park");
            return "car";
        };
        car.park(10);

        Vehicle bike=(int num)->{
            System.out.println("Bike park");
            return "bike";
        };
    }
}
