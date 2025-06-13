package reflect4;

public class Student4 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }

    public Student4() {
        System.out.println("调用了无参构造");
    }

    public Student4(String name) {
        this.name = name;
        System.out.println("调用了有参构造");
    }
    private Student4(String name, int age) {
        this.name = "小李";
        this.age = 18;
        System.out.println("调用了有参构造");
    }

    public void show() {
        System.out.println("学生信息：" + name + ", 年龄：" + age);
    }
}
