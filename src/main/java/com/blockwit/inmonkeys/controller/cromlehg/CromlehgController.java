package com.blockwit.inmonkeys.controller.cromlehg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/cromlehg")
public class CromlehgController {

	@GetMapping
	@ResponseBody
	public String home() {
		System.out.println("ssss");
		return "Hello, cromlehg";
	}


}
