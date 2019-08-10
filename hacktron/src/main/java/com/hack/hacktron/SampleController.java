package com.hack.hacktron;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hacktron")
public class SampleController {

	@RequestMapping("/hello")
	public @ResponseBody String message() {
		return "hello";
	}
}
