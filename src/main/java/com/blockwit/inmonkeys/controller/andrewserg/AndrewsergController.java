package com.blockwit.inmonkeys.controller.andrewserg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/andrewserg")
public class AndrewsergController {

	@GetMapping
	@ResponseBody
	public String home() {
		return "Hello, andrewserg";
	}


}
