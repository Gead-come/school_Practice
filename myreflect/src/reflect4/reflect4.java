package reflect4;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;


public class reflect4 {
    public static void main(String[] args) throws Exception {


        Properties pro = new Properties();

        FileInputStream buff = new FileInputStream("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\myreflect\\src\\config.properties");
        pro.load(buff);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        String argValue = pro.getProperty("argValue");

        Class<?> aClass = Class.forName(className);
        Object o = aClass.getDeclaredConstructor().newInstance();
        Method de = aClass.getDeclaredMethod(methodName, String.class);
        de.invoke(o, argValue);


    }

}
