package utile;

public class aa {

    public static void print(String name){
        if (name != null)
        System.out.println("aa"+name.length());

    }
    public static int index(String date){
        if (date == null){
            return -1;
        }
        return date.length();
    }
}
