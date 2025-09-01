import java.util.LinkedList;

public class Demo9 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Geethma");
        list.add("Dilshan");
        list.add("Danidu");
        list.add("Tharuka");

        System.out.println(list.size());

        for (String temp:list){
            System.out.println(temp);
        }
        list.removeLast();
        System.out.println(list);
    }
}
