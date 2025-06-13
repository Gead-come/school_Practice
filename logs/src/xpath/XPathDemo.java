package xpath;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;

public class XPathDemo {
    public static void main(String[] args) throws Exception {
        // 1. 读取 XML 文件
        Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\logs\\src\\student.xml");

        // 2. 创建 XPath 对象
        XPath xpath = XPathFactory.newInstance().newXPath();

        // 3. 编写 XPath 表达式
        String expression = "/students/student[1]/name";

        // 4. 执行查询
        String name = (String) xpath.evaluate(expression, doc, XPathConstants.STRING);

        System.out.println("第一个学生的名字是：" + name);
    }
}
