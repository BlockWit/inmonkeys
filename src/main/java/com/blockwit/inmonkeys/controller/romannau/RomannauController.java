package com.blockwit.inmonkeys.controller.romannau;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/romannau")
public class RomannauController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, romannau";
	}


}
