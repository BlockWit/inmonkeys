package com.blockwit.inmonkeys.controller.mrserg86;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/mrserg86")
public class Mrserg86Controller {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, mrserg86";
	}


}
