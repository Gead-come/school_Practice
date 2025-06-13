package annot;

import java.lang.annotation.*;

@Target(ElementType.METHOD)  // 表示注解能加在哪（类、方法、字段…）
@Retention(RetentionPolicy.RUNTIME) // 生命周期，到运行时还保留
public @interface MyTest {
    String value() default "默认值";
}
