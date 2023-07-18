package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

//Chef라는 존재가 호텔에서도 필요하다고 가정할 때

//@Autowired 어노테이션 없이 처리
//@Autowired는 스프링 내부에서 자신이 특정한 객체에 의존적이므로 자신에게 해당 타입의 빈을 주입해주라는 표시
@Component
@ToString
@Getter
public class SampleHotel {
	private Chef chef;
	
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
}
