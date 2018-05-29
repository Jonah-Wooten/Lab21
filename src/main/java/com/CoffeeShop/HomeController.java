package com.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.CoffeeShop.dao.PersonDao;
import com.CoffeeShop.model.Items;
import com.CoffeeShop.model.Person;



@Controller
public class HomeController {
	
@Autowired	
private PersonDao pDao;

	@RequestMapping("/")
	public ModelAndView home() {
		List<Items> Items = pDao.itemfind();	
		return new ModelAndView("Index", "Items", Items);
		
	}
	@RequestMapping("/Reg")
	public ModelAndView rPage() {
		return new ModelAndView("Reg", "", "");
		
	}
	@RequestMapping("/summary")
	public ModelAndView data(Person p) {
		pDao.addPersonDao(p);
		System.out.println(p);
		return new ModelAndView("summary", "Person", p);
		
	}
	
	
}
