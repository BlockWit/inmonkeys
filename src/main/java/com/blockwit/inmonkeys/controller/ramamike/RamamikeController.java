package com.blockwit.inmonkeys.controller.ramamike;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ramamike")
public class RamamikeController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, ramamike";
	}


}
