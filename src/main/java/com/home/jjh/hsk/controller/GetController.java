package com.home.jjh.hsk.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetController {

	@Autowired
	private GetService getService;

	@CrossOrigin("*")
	@GetMapping("/getapiuser")
	public String getApiUser(@RequestParam("email") String email){

		System.out.println("inininin");

		userModel userModelData = getService.getApiUser(email);
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");


		Gson gson = new Gson();
		String jsonData = gson.toJson(userModelData) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

//		if (element == null){
//			String emptyJsonData = gson.toJson(new userModel(
//					"2" ,
//					"displayname" ,
//					"email" ,
//					"bannerId" ,
//					"banner_id" ,
//					"phoneNumber" ,
//					"photoUrl" ,
//					"providerId"
//			) ) ;
//			obj.add("result" , gson.fromJson(emptyJsonData, JsonElement.class) );
//		}else{
//			obj.add("result" , element);
//		}

		return obj.toString();
	}

	@CrossOrigin("*")
	@GetMapping("/getapiad")
	public String getApiAd(){
		List<adModel> data = getService.getApiAd();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);
		return obj.toString();
	}

	@CrossOrigin("*")
	@GetMapping("/getapiintro")
	public String getApiIntro(){
		List<introModel> data = getService.getApiIntro();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}


	@CrossOrigin("*")
	@GetMapping("/getapievent")
	public String getApiEvent(){
		List<eventModel> data = getService.getApiEvent();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@CrossOrigin("*")
	@GetMapping("/getapiitem") //추후 스토어 이름 .. 등등으로 검색 가능하도록 추가.
	public String getApiItem(){
		List<itemModel> data = getService.getApiItem();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@CrossOrigin("*")
	@GetMapping("/getapiaddata")
	public String getApiAdDataItem(){
		List<adDataModel> data = getService.getApiAdDataItem();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@CrossOrigin("*")
	@RequestMapping(method = RequestMethod.GET, path = "/getapishopdata")
	public String getApiShopsItem(){
		List<shopsModel> data = getService.getApiShopsDataItem();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@CrossOrigin("*")
	@RequestMapping(method = RequestMethod.GET, path = "/getApiMainBanner")
	public String getApiMainBanner(){
		List<shopsModel> data = getService.getApiMainBanner();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@CrossOrigin("*")
	@RequestMapping(method = RequestMethod.GET, path = "/getApiTestJoin")
	public String getApiTestJoin(){

		testJoinModel data = getService.getApiTestJoin();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}
}