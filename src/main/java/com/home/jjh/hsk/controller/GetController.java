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

	@GetMapping("/getapiuser")
	public String getApiUser(@RequestParam("email") String email){
		List<userModel> userModelData = getService.getApiUser(email);
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(userModelData) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);
		return obj.toString();
	}

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
}