package com.charvikent.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class adminController {
	
	/** this is coding for error messages in admin url
	 * @return
	 */
	@GetMapping("*")
	
	public String error404()
	{
		
		String str="invalid url";
		
		
		return str;
		
		
		
	}

}
