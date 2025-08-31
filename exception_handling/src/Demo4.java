public class Demo4 {
    public static void main(String[] args) {
        System.out.println(get());
    }
    public static String get(){
        try {
            return "try";
        }catch (RuntimeException e){
            return "catch runtime";
        }catch (Exception e){
            return "catch exception";
        }finally {
            return "finally";
        }
    }
}
