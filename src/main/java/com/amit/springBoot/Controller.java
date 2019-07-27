package com.amit.springBoot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class Controller {

	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return "hiiiiiiii";
	}

}
