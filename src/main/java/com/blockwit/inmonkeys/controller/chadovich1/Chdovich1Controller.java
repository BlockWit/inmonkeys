package com.blockwit.inmonkeys.controller.chadovich1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/chdovich1")
public class Chdovich1Controller {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, chadovich1";
	}


}
