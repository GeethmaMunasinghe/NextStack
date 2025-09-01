import java.util.HashMap;
import java.util.Map;

public class Demo10 {
    public static void main(String[] args) {
        Map<String,String> bioData=new HashMap();
        bioData.put("name","Geethma");
        bioData.put("age","24");
        bioData.put("occupation","SQA");

        System.out.println(bioData.get("name"));

        Map<String,Integer> studentMarks=new HashMap<>();
        studentMarks.put("s1",67);
        studentMarks.put("s2",90);
        studentMarks.put("s3",23);

        System.out.println(studentMarks);
    }
}
