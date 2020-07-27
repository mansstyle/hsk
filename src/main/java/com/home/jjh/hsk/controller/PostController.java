package com.home.jjh.hsk.controller;

import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("/setApiUser")
	public void setApiUser(@RequestBody userModel userModel) {
		postService.setApiUser(userModel);
	}

	@PostMapping("/setApiMain_banner_item")
	public void setApiMain_banner_item(@RequestBody main_banner_item main_banner_item) {
		postService.setApiMain_banner_item(main_banner_item);
	}

	@PostMapping("/insertShop")
	public void inserShop(@RequestBody shopsModel shopsModel) {
		postService.inserShop(shopsModel);
	}

	@PostMapping("/insertNewItem")
	public void insertNewItem(@RequestBody itemModel itemModel) {
		postService.insertNewItem(itemModel);
	}

	@PostMapping("/insertItemDetail")
	public void insertNewDetailItem(@RequestBody itemDetailModel itemDetailModel) {
		postService.insertItemDetail(itemDetailModel);
	}

	@PostMapping("/insertEvent")
	public void insertEventItem(@RequestBody eventModel eventModel){
		postService.insertEvent(eventModel) ;
	}

}