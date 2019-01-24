package com.capgemini.websiteService.websiteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class websiteController {
	
	@Autowired
	private RestTemplate template;
	
	   @RequestMapping("/")
	   public ModelAndView home() {
		   String responseOne = template.getForObject("http://localhost:9090/hello", String.class);
		   return new ModelAndView("hello","message",responseOne);
	   }
}
