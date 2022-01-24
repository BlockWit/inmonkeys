package com.blockwit.inmonkeys.controller.lyubovsergv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/lyubovsergv")
public class LyubovsergvController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, lyubovsergv";
	}


}
