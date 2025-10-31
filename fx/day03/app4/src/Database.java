import java.util.ArrayList;

public class Database {
    public static ArrayList<Student> studentDb=new ArrayList<>();

    static {
        studentDb.add(new Student("98","Geethma",26));
        studentDb.add(new Student("99","Nethuli",27));
        studentDb.add(new Student("97","Vihangaa",24));

    }
}
