package com.home.jjh.hsk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String main(){
		return "home";
	}

	@RequestMapping(path = "/store" , method = RequestMethod.GET)
	public String store(){
		return "addStore";
	}

	@RequestMapping(path = "/event" , method = RequestMethod.GET)
	public String event(){
		return "addEvent";
	}

	@RequestMapping(path = "/eventlist" , method = RequestMethod.GET)
	public String eventList(){
		return "eventlist";
	}

	@RequestMapping(path = "/login" , method = RequestMethod.GET)
	public String login(){
		return "login";
	}


}