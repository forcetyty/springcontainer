package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

// Java Config 설정!!!
// Bean이라는 Annotation을 인식할수 있게 해야 한다.
// Spring MVC에서 사용하는 Config는 ClasspathXmlAppliationContext이다.!!!
// java config 설정을 위해서 ClassPathXmlApplicationContext를 변경해주어야 한다,.
public class UserConfig01 {
	
	@Bean
	public User user() {
		return new User();
	}
	
	
	@Bean
	public Friend friend() {
		return new Friend("둘리");
	}

}
