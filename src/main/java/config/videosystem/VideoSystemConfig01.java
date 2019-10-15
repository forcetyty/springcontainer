package config.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration	// Package에 가서 스캐닝하라는 뜻!!!
@Import({DVDConfig.class, DVDPlayerConfig.class})	//두개의 설정파일을 Mix 작업!!!
public class VideoSystemConfig01 {
	
	

}
