package reflect;

public class reflect1 {
    public static void main(String[] args) throws ClassNotFoundException {

          // 认识反射

          /* 获取Class对象,  三种方式
         *  Class.forName("全类名")
         *
         *  2.  对象.getClass()
         *
         * 3.   类.class
         *
           */

        // 1.使用场景，最为常用，
        Class<?> aClass = Class.forName("reflect.Student");
        System.out.println(aClass);

        // 2.更多是作为参数进行传递
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        // 3.当我们已经有类的对象时，我们可以通过这个对象获取它的Class对象
        Class<? extends Student> aClass1 = new Student().getClass();
        System.out.println(aClass1);

        System.out.println(aClass == studentClass);
        System.out.println(aClass == aClass1);

    }
}
