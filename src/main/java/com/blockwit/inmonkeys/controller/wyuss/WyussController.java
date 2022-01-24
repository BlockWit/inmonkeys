package com.blockwit.inmonkeys.controller.wyuss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/wyuss")
public class WyussController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, wyuss";
	}


}
