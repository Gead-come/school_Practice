package reflect2;

public class Student2 {
   private String name;
   private int age;
   private double score;


    public Student2() {

    }
    public Student2(String name) {
        this.name = name;
    }
    protected Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student2(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
