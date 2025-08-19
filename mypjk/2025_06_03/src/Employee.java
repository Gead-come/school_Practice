public class Employee {
     private String name ;
     //性别
     private String sex;

     private int age;

     private  String department;

     @Override
     public String toString() {
          return
                   name+"("  + sex+"," +  age+"岁，" + department+ ")\n" ;


     }

     public Employee(String department) {


     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getSex() {
          return sex;
     }

     public void setSex(String sex) {
          this.sex = sex;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }

     public Employee(String name, String sex, int age, String department) {
          this.name = name;
          this.sex = sex;
          this.age = age;
          this.department = department;

     }
}
