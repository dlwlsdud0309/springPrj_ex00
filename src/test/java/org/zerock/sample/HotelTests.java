package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//테스트 시 필요한 클래스 지정, SpringJUnit4ClassRunner가 대상이 됨
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTests {

	@Setter(onMethod_ = {@Autowired})
	private SampleHotel hotel;
	
	@Test //JUnit에서 테스트 대상을 표시하는 어노테이션
	public void testExist() {
		assertNotNull(hotel); //변수가 null이 아니어야만 테스트가 성공한다는 것을 의미
	
		log.info(hotel);
		log.info("------------------");
		log.info(hotel.getChef());
	}
}
