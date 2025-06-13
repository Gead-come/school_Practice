package logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class logs1 {

      //  日志框架
    public static final Logger LOG = LoggerFactory.getLogger(logs1.class);
    public static void main(String[] args) {

        System.out.println("输入账号");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("输入密码");
        String pwd = sc.nextLine();
        if ("amid".equals(name) && "123".equals(pwd)){
            System.out.println("登录成功");
            LOG.info("登录成功");
        }else{
            System.out.println("登录失败");
            LOG.info("登录失败");
            LOG.error("用户名或密码错误");
        }
    }
}
