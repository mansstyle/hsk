package com.home.jjh.hsk.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

	@RequestMapping("/hello")
	public String HelloController(){
		return "hello, spring boot!";
	}

}