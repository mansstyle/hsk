package com.home.jjh.hsk.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.BatchUpdateException;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@CrossOrigin("*")
	@PostMapping("/setApiUser")
	public List<userModel> setApiUser(@RequestBody userModel userModel) {

		return postService.setApiUser(userModel);
	}

	@CrossOrigin("*")
	@PostMapping("/setApiMainBanneItem")
	public void setApiMainBannerItem(@RequestBody mainBannerItem mainBannerItem) {
		postService.setApiMainBannerItem(mainBannerItem) ;
	}

	@CrossOrigin("*")
	@PostMapping("/insertShop")
	public String inserShop(@RequestBody shopsModel shopsModel) {

		JsonObject obj = new JsonObject();

		try{
			obj.addProperty("errCd" , 0);
			obj.addProperty("errMsg" , "등록되었습니다.");

			postService.inserShop(shopsModel);
		}catch (DuplicateKeyException e){ //중복된 키가 있음... 이미 등록된 아이템
			obj.addProperty("errCd" , -1);
			obj.addProperty("errMsg" , "이미 등록되었습니다.");
			System.out.println("error");
		}

		Gson gson = new Gson();
		String jsonData = null ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString() ;
	}

	@CrossOrigin("*")
	@PostMapping("/insertNewItem")
	public void insertNewItem(@RequestBody itemModel itemModel) {
		postService.insertNewItem(itemModel);
	}

	@CrossOrigin("*")
	@PostMapping("/insertItemDetail")
	public void insertNewDetailItem(@RequestBody itemDetailModel itemDetailModel) {
		postService.insertItemDetail(itemDetailModel);
	}

	@CrossOrigin("*")
	@PostMapping("/insertEvent")
	public void insertEventItem(@RequestBody eventModel eventModel){
		postService.insertEvent(eventModel) ;
	}

	@CrossOrigin("*")
	@PostMapping("/insertTbScore")
	public void insertTbScore(@RequestBody tbScoreModel tbScoreModel){
		postService.insertTbScore(tbScoreModel) ;
	}

	@CrossOrigin("*")
	@PostMapping("/insertTbCodiList")
	public void insertTbCodi(@RequestBody tbCodiModel tbScoreModel){
		postService.insertTbCodiList(tbScoreModel) ;
	}

	@CrossOrigin("*")
	@PostMapping("/insertTbMDPickList")
	public void insertTbMDPick(@RequestBody tbMDPickModel tbMDPickModel){
		postService.insertTbMDPickList(tbMDPickModel) ;
	}


	@CrossOrigin("*")
	@PostMapping("/deleteEvent")
	public void deleteEvent(@RequestBody eventDeleteModel eventDeleteModel){
		postService.deleteEvent(eventDeleteModel) ;
	}

}