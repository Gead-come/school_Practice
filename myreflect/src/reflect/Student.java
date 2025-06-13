package reflect;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "reflect.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
     public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
