package com.arindol.controler;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	
	
}
