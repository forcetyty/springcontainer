package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

		
	@Autowired
	@Qualifier("highSchoolRapper3Final") //등록되어 있는 CD의 객체를 주입하게 된다.
	private CompactDisc compactDisc;

	// 스프링 기반의 와이어링 어노테이션을 사용할 수 없는 경우
	// @Autowired와는 별 차이는 없다.
	// @Inject // 자기가 선호하는 것을 일관성 있게 사용하면 된다.
	// 와이어링2 : @Autowired + 생성자
	// @Autowired
	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public CDPlayer() {
		System.out.println("CDPlayer() 기본 생성자 호출!!!");
	}

	// 와이어링3 : @Autowired + setter
	// @Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	// 와이어링4 : @Autowired + 일반메소드
	//@Autowired
	public void insertCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public void play() {
		compactDisc.play();
	}

}
