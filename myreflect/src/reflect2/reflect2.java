package reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflect2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("reflect2.Student2");

      /*  Constructor<?>[] con1 = aClass.getConstructors();
       for (Constructor<?> constructor : con1) {
            System.out.println("所有公用构造方法"+constructor);



        Constructor<?>[] con2 = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : con2) {
            System.out.println("所有构造方法"+constructor);
        }

        Constructor<?> con3 = aClass.getConstructor(String.class);
        System.out.println("指定构造方法"+con3);
        Constructor<?> con4 = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println("指定构造方法"+con4);
        */
        Constructor<?> con5 = aClass.getDeclaredConstructor(String.class, int.class, double.class);
        System.out.println("指定构造方法"+con5);

        int modifiers = con5.getModifiers();  // 获取修饰符
        System.out.println("修饰符"+modifiers); // 1
        System.out.println("构造方法名称"+con5.getName());
        Class<?>[] parameterTypes = con5.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println("参数类型"+parameterType);
        }
          // 暴力反射
        con5.setAccessible(true);
        Student2 stu =(Student2) con5.newInstance("张三", 18, 99.9);

        System.out.println(stu);
    }
}
