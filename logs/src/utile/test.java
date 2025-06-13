package utile;

import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void print()
    {
        new aa().print("hello world");
        aa.print("");
        aa.print(null);
        aa.print("admin");

    }
    @Test
    public void index(){
//        System.out.println(aa.index("admin"));
//        System.out.println(aa.index(""));
//        System.out.println(aa.index(null));

        int index1 = aa.index(null);
        Assert.assertEquals("NULL测试", -1,index1);  // 断言
        int index2 = aa.index("");
        Assert.assertEquals("空格测试",-1,index2);
        int index3 = aa.index("admin");
        Assert.assertEquals("admin测试",4,index3);

    }
}
