package com.charvikent.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminController {
	
	/** this is coding for error messages in admin url
	 * @return
	 */
	@GetMapping("/jsp")
	public String showJspPage()
	{
		
		String str="invalid url";
		System.out.println("enter to jsp page");
		
		
		return "home";
		
		
	}
	@GetMapping("/login")
	public String showLoginPage()
	{
		
		String str="invalid url";
		System.out.println("enter to jsp page");
		
		
		return "login";
		
		
	}
	@GetMapping("/login1")
	public String showLogin1Page()
	{
		
		String str="invalid url";
		System.out.println("enter to jsp page");
		
		
		return "login1";
		
		
	}

}
