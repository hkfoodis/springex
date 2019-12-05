package org.zerock.shoppingcart.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // HelloWorld라는 문자열을 JSON 형태로 반환
public class WebRestController {

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
}
