public class Student {
    private String name;
    private int age;

    public Student() {
    }

      public Student(String name){
          String[] split = name.split(",");
          this.name = split[0];
          this.age = Integer.parseInt(split[1]);
      }
    @Override
    public String toString() {
        return  name + " " + age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
