package reflect3;

public class Student3 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student3() {
        System.out.println("调用了无参构造");
    }

    public Student3(String name) {
        this.name = name;
        System.out.println("调用了有参构造");
    }
    private Student3(String name, int age) {
        this.name = "小李";
        this.age = 18;
        System.out.println("调用了有参构造");
    }

    public void show() {
        System.out.println("学生信息：" + name + ", 年龄：" + age);
    }
}
