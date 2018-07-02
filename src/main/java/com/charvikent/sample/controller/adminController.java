package com.charvikent.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")

public class adminController {
	
	/** this is coding for error message
	 * @return
	 */
	@GetMapping("*")
	
	public String error404()
	{
		
		String str="invalid url";
		
		
		return str;
		
		
		
	}

}
