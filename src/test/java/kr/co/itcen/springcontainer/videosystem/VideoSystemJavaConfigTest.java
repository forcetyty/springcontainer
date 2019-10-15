package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.DVDPlayerConfig;
import kr.co.itcen.springcontainer.config.soundsystem.SoundSystemConfig;

/*
 * Explicit(명시적) Configuration - Java Config
 * @Bean
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DVDPlayerConfig.class})	// classes - class //locations - xml
public class VideoSystemJavaConfigTest {
	
	@Rule
	public final SystemOutRule SystemOutRule = new SystemOutRule().enableLog();
	
	
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testPlayerNull() {
		assertNotNull("player");
	}
	
	@Test
	public void testPlay() {
		player.play();
		//assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
		assertEquals("Playing Movie MARVEL's Avengers Infinity War", SystemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

}
