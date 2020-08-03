package com.home.jjh.hsk.controller;

import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("/setApiUser")
	public List<userModel> setApiUser(@RequestBody userModel userModel) {
		//
		return postService.setApiUser(userModel);
	}

	@PostMapping("/setApiMainBanneItem")
	public void setApiMainBannerItem(@RequestBody mainBannerItem mainBannerItem) {
		postService.setApiMainBannerItem(mainBannerItem) ;
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