package org.zerock.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Bakery {

	@Setter(onMethod_= @Autowired)
	private Bread bread;
}