package com.blockwit.inmonkeys.controller.dpelipen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/dpelipen")
public class DpelipenController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, dpelipen";
	}


}
