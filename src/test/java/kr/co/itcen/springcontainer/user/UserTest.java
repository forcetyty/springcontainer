package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserConfig01.class})
public class UserTest {
	
	@Autowired
	private User user;
	
	@Autowired
	private Friend friend;
	
//	@Test
//	public void testMethod() {
//		//      Pom에 있는 Junit에 있는 scope이 Test의 Annotatation 기능을 사용할 수 있게 해준다. 
//		//		<scope>test</scope> 
//		int x = 8;
//		assert( x - 2 == 6);
//	}
	
	@Test
	public void testUserNull() {
		//assert(user != null);
		// Container가 만들어져서 생성됨.
		assertNotNull(user);
	}
	// Junit을 통해서 Test함으로써 코드의 문제를 해결하는 방법을 TDD라고 한다.
	
	@Test
	public void testFriendNull() {
		assertNotNull(friend);
	}
	
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(), "둘리");
	}

}
