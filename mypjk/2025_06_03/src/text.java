import java.util.*;
import java.util.stream.Collectors;

public class text {
    public static void main(String[] args) {

        List<Employee> student = new ArrayList<>();
      /*    student.add(new Employee("张三","男",40,"人事部"));
        student.add(new Employee("李四","男",55,"技术部"));
         student.add(new Employee("王五","男",41,"人事部"));
          student.add(new Employee("赵六","男",20,"人事部"));
           student.add(new Employee("钱七","男",18,"技术部"));
           student.add(new Employee("孙八","男",28,"人事部"));
           student.add(new Employee("周八","男",30,"技术部"));

      */

        Collections.addAll(student,
                new Employee("张三", "男", 40, "运营部"),
                new Employee("李四", "男", 55, "技术部"),
                new Employee("王五", "男", 41, "人事部"),
                new Employee("赵六", "男", 20, "技术部"),
                new Employee("钱七", "男", 18, "技术部"),
                new Employee("孙八", "男", 28, "人事部"),
                new Employee("周八", "男", 66, "技术部"),
                new Employee("周5", "男", 30, "运营部"),
                new Employee("周5", "男", 29, "技术部"));
        System.out.println("全部员工如下\n" + student);
        System.out.println("年龄小于30岁如下：\n");

        List<Employee> d = student.stream()
                .filter(employee -> employee.getDepartment().equals("技术部"))
                .filter(employee -> employee.getAge() < 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList())
                .reversed();

        for (Employee employee : d) {

            System.out.println(employee);
        }
        System.out.println("输入查找的姓名\n");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        boolean flag = false;
        for (Employee employee : student) {
            if (employee.getName().equals(next)) {
                System.out.println("查询结果为 ：" + employee.getName() + " "
                        + employee.getAge() + " "
                        + employee.getSex() + " "
                        + employee.getDepartment());
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println("没有该员工");
        }
        Optional<Employee> result = student.stream()
                .filter(e -> e.getName().equals(next))
                .findFirst();

        result.ifPresentOrElse(
                e -> System.out.println("查询结果为：" + e),
                () -> System.out.println("没有该员工")
        );

         /*  student.stream().filter(name->name.getName().equals(next))
                   .findFirst()
                   .ifPresentOrElse( System.out::println,()->System.out.println("没有该员工"));

         student.stream().filter(name->name.getName().equals(next))
                 .findFirst()
                 .ifPresentOrElse(name-> System.out.println("查询结果为"),()
                         -> System.out.println("没有该员工"));

          */

        // 获取所有员工姓名
   student.stream().map(s->s.getName()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();

    // 获取技术安全部员工年龄
        List<Integer> dd = student.stream().filter(depar -> depar.getDepartment().equals("技术部"))
                .map(age -> age.getAge())
                .sorted(Comparator.comparingInt(age -> age))
                .collect(Collectors.toList()).reversed();
        System.out.println(dd);

           // 获取运营部的人数
        long ff = student.stream().filter(num -> num.getDepartment().equals("运营部"))
                .count();
        System.out.println("运营部人数为：" + ff);

    }

}
