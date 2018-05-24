package com.lab21.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.model.Person;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		
		return new ModelAndView("Index", "", "");
		
	}
	@RequestMapping("/Reg")
	public ModelAndView rPage() {
		return new ModelAndView("Reg", "", "");
		
	}
	@RequestMapping("/summary")
	public ModelAndView data(@RequestParam("fName") String fName,@RequestParam("lName") String lName, @RequestParam("eName")String eName, @RequestParam("pNumber")int pNumber, @RequestParam("passN")String passN) {
		System.out.println(fName);
		
		return new ModelAndView("summary", "abc", new Person (fName, lName, eName, pNumber, passN));
		
	}
	
	
}
