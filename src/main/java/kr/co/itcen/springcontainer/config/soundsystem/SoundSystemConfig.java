package kr.co.itcen.springcontainer.config.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import kr.co.itcen.springcontainer.soundsystem.CDPlayer;

@Configuration
@ComponentScan(basePackages = {"kr.co.itcen.springcontainer.soundsystem"})
public class SoundSystemConfig {
	
	
}
