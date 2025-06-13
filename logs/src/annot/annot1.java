package annot;

public class annot1 {
    @my_annot(name="张三",age=18,sex="男")
  //  @MyTest(value = "赵武")
    @MyTest("赵武")
    public static void main(String[] args) {


          // 注解测试

        /*
        当注解里有value属性时，可以省略value，
        有2个参数时，如果有一个为默认值，可以省略value


         */

    }
}
