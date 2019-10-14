package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {

	public static void main(String[] args) {
		// testBeanFactory();
		testApplicationContext();
	}

	public static void testApplicationContext() {
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("config/user/applicationContext01.xml");

		// error : 같은 타입의 빈이 1개 이상 있는 경우
		// 타입으로 가져오면 예외 발생.
		// User user1 = appCtxt.getBean(User.class);

		// id로 가져오기
		// (User)로 캐스팅 해주느 안으면 오류가 발생한다.
		// 왜냐면 getBean으로 가져올때, 가져오는 것이 무엇인지 모르기때 문에 Object로 가져오기 때문이다.
		// id으로 가져오기
		User user1 = (User) appCtxt.getBean("user1");
		System.out.println(user1);

		// name으로 가져오기!!!
		User usr2 = (User) appCtxt.getBean("usr2");
		System.out.println(usr2);
		
		// singleton 확인!!!
		User user2 = (User) appCtxt.getBean("user2");
		System.out.println( "Singleton 확인 : " + (usr2 == user2));
		
		// User(Long, String)으로 생성된 Bean 가져오기
		User user3 = (User) appCtxt.getBean("user3");
		System.out.println( user3 );
		
		// User()으로 생성되고 프로퍼티 세팅(Setter)을 한 빈 가져오기
		User user4 = (User) appCtxt.getBean("user4");
		System.out.println( user4 );
		
		// DI 설정한 빈 가져오기!!!
		User user5 = (User) appCtxt.getBean("user5");
		System.out.println( user5 );
		
		// DI2 설정한 빈 가져오기!!!
		User user6 = (User) appCtxt.getBean("user6");
		System.out.println( user6 );
		
		// interface를 구현
		//((ConfigurableApplicationContext) appCtxt).close();

	}

//	public static void testBeanFactory() {
//		
//		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext01.xml"));
//		User user = bf1.getBean(User.class);
//		
//		System.out.println(user);
//		
//		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext02.xml"));
//		user = bf2.getBean(User.class);
//		
//		System.out.println(user);
//	}

}
