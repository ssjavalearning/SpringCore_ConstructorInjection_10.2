package test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Traveler;


public class TestTravel {

	public static void main(String[] args) {

		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Traveler traveler = context.getBean("traveler", Traveler.class);
			traveler.go();
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}
}
