package reflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect3_2 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("reflect3.Student3");

        // 打印所有构造方法
        Constructor<?>[] dec = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : dec) {
            System.out.println(declaredConstructor);
        }

        // 获取私有构造方法并实例化对象
        Constructor<?> con1 = aClass.getDeclaredConstructor(String.class, int.class);
        con1.setAccessible(true); // 允许访问私有构造方法
        Object o = con1.newInstance("张三", 18); // 正确传参

        System.out.println(o);

        // 获取并设置私有字段 name
        Field nameField = aClass.getDeclaredField("name");
        nameField.setAccessible(true); // 允许访问私有字段
        nameField.set(o, "李四"); // 设置对象 o 的 name 字段为 "李四"

        // 获取并设置私有字段 age
        Field ageField = aClass.getDeclaredField("age");
        ageField.setAccessible(true); // 允许访问私有字段
        ageField.set(o, 20); // 设置对象 o 的 age 字段为 20

        // 调用 show 方法
        Method showMethod = aClass.getMethod("show"); // 获取 public 方法
        showMethod.invoke(o); // 调用 o.show()

        // 输出对象信息（需要重写 toString）
        System.out.println(o);
    }
}
