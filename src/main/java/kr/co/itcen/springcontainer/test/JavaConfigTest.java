package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.user.UserConfig01;
import kr.co.itcen.springcontainer.user.User;

public class JavaConfigTest {

	public static void main(String[] args) {
		testUser01();
		testUser02();
	}

	// 1. Explicit Java Config - 명시적 선언!!!
	// Java config Class를 명시한다. [Explicit Configuration]
	// [Java Config Class]
	public static void testUser01() {

		// 1. ApplicationContext appCtxt = new
		// ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		// 1과 비교하면서 확인필요
		ApplicationContext appCntx = new AnnotationConfigApplicationContext(UserConfig01.class);

		User user = appCntx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext) appCntx).close();
	}
	
	// 2.자동으로 Java Config Class를 스캐닝 (Auto - Scan) 
	public static void testUser02() {
		
		// 1. ApplicationContext appCtxt = new
		// ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		// 1과 비교하면서 확인필요
		ApplicationContext appCntx = new AnnotationConfigApplicationContext("config.user");
		
		User user = appCntx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext) appCntx).close();
	}

}
