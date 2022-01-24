package com.blockwit.inmonkeys.controller.сrazykokos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/сrazykokos")
public class CrazykokosController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, сrazykokos";
	}


}
