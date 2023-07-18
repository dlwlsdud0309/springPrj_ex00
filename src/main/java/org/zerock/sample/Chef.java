package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component //스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시하는 어노테이션
@Data
public class Chef {

	
	// @Component
	// 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시
	// 존재하는 클래스들을 객체로 생성해서 빈으로 관리
}
