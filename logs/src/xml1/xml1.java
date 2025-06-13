package xml1;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xml1 {
    public static void main(String[] args) throws DocumentException {

        ArrayList<Object> list = new ArrayList<>();

        SAXReader saxReader = new SAXReader();

        File file = new File("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\logs\\src\\student.xml");

        Document read = saxReader.read(file);
        System.out.println(read);
        Element rootElement = read.getRootElement();
        System.out.println(rootElement);
        List<Element> elements = rootElement.elements("stu");
        System.out.println(elements);
        for (Element element : elements) {
            Attribute id = element.attribute("id");
            String text = id.getText();

            Element name = element.element("name");
            String text1 = name.getText();

            Element sex = element.element("sex");
            String text2 = sex.getText();
            char c = text2.charAt(0);

            Element age = element.element("age");
            String text3 = age.getText();
            int i = Integer.parseInt(text3);

            stu stu = new stu(text1, c, i);
            Collections.addAll(list, stu);


            // System.out.println("学号："+text+" 姓名："+text1+" 性别："+text2+" 年龄："+text3);
        }
     list.stream().forEach(s-> System.out.println(s));




    }
}
