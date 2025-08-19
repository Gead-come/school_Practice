package logs;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class logs1 {

      //  日志框架

 //   public static final Logger LOG = LoggerFactory.getLogger(logs1.class);
    public static void main(String[] args) {

        System.out.println("输入账号");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("输入密码");
        String pwd = sc.nextLine();
        if ("amid".equals(name) && "123".equals(pwd)){
            System.out.println("登录成功");
            log.info("登录成功");
        }else{
            System.out.println("登录失败");
            log.info("登录失败");
            log.error("用户名或密码错误");

        }

    }
}
