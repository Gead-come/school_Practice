package reflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect3 {
    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("reflect3.Student3");

        Constructor<?>[] de = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : de) {
             System.out.println(constructor);
        }
        Constructor<?> cl = aClass.getDeclaredConstructor(String.class, int.class);
       cl.setAccessible(true);
        Object o = cl.newInstance("张三", 18);
        Method show1 = aClass.getMethod("show");
       show1.invoke(o);
        System.out.println("=======================================");
        Field[] file = aClass.getDeclaredFields();
        for (Field field : file) {
            System.out.println(field);
        }
        Field name = aClass.getDeclaredField("name");
        Field age = aClass.getDeclaredField("age");
        name.setAccessible(true);
        name.set(o,"复古");
        age.setAccessible(true);
        age.set(o,88);
        Method show = aClass.getMethod("show");
        show.invoke(o);
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}