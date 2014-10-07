package sample3;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.FileSystemResource;

//import sample1.MessageBean;

public class HelloApp {

	public static void main (String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("bean.xml"));
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		bean.sayHello("Spring1");
	}
}
