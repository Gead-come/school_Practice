package xml1;

public class stu {
    String  name;
    char sex;
    int age;

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public stu() {
    }

    public stu(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
