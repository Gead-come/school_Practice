package kaoashi;

public class item {
    String name;
    public item(String name)
    {
        this.name = name;
    }

    public static void main(String[] args) {

        item[] items = new item[3];
        String[]arr = {"a","b","c"};
        System.out.println(arr.length);

        items [1] = new item("a");
        items [2] = new item("b");
        for (item item : items) {
            System.out.println(item.name);
        }
    }
}
