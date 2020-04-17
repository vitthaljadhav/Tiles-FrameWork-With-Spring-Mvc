package com.info.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	@RequestMapping(value="/hello")
	public String getHome(Model m) {
		String message = "This is Spring  with Tiles FrameWork";
		m.addAttribute("message", message);
		return "hello";
	}
}
