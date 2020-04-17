package com.info.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.info.tiles.form.contact;

@Controller
@SessionAttributes
public class BodyController {
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String getBodyPage(@ModelAttribute("contact")	contact contact, BindingResult result) {
		return "redirect:contact.htm";
	}
	@RequestMapping(value="/contact")
	public String anothePage(Model m) {
		m.addAttribute("command", new contact());
		return"body";
	}
}
