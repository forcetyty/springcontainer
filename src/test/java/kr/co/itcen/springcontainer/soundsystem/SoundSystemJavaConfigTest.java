package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.itcen.springcontainer.config.soundsystem.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SoundSystemConfig.class})	// classes - class //locations - xml
public class SoundSystemJavaConfigTest {
/*	
 * Auto Configuration - Java config
 * Component Scanning(@Component, @Named, @Autowired, @Inject)
 * 					  @Service
 * 					  @Controller
 * 					  @Repository
 * 					-- Spring MVC / Spring contianer --
 */
	
	
	@Rule
	public final SystemOutRule SystemOutRule = new SystemOutRule().enableLog();
	
	// 와이어링1 : @Autowired + 필드
	@Autowired
	@Qualifier("highSchoolRapper3Final")	//등록되어 있는 CD의 객체를 주입하게 된다.
	private CompactDisc cd;
	
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 지구멸망 by 양승호", SystemOutRule.getLog().replace("\r\n","").replace("\n",""));
	}
	

}
