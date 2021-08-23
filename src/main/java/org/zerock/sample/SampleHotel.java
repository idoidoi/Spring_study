package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;


//필드 주입 
//세터 주입
//생성자 주입
@Component
@ToString
public class SampleHotel {
	
	

	private Chef Chef;
	
	public SampleHotel(Chef chef) {
		super();
		Chef = chef;
	}
	
}
