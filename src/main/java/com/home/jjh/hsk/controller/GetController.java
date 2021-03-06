package com.home.jjh.hsk.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.home.jjh.hsk.model.*;
import com.home.jjh.hsk.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetController {

	@Autowired
	private GetService getService;

	@GetMapping("/getapiuser")
	public String getApiUser(@RequestParam("email") String email){
		userModel userModelData = getService.getApiUser(email);
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
		//
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		//
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty("emgContent" , data.get(0).getEmgContent());
		resultObj.addProperty("emgTitle" ,  data.get(0).getEmgTitle());
		resultObj.addProperty("lastAos" , data.get(0).getLastAos());
		resultObj.addProperty("lastIos" , data.get(0).getLastIos());
		resultObj.addProperty("upMsgAos" , data.get(0).getUpMsgAos());
		resultObj.addProperty("upMsgIos" , data.get(0).getUpMsgIos());
		resultObj.addProperty("upTitleAos" , data.get(0).getUpTitleAos());
		resultObj.addProperty("upTitleIos" , data.get(0).getUpTitleIos());
		resultObj.addProperty("verAos" , data.get(0).getVerAos());
		resultObj.addProperty("verIos" , data.get(0).getVerIos());


		Gson gson = new Gson();
//		String jsonData = gson.toJson(data) ;

		ArrayList<JsonObject> listItemObj = new ArrayList<>() ;

		//
		for (int i = 0; i < data.size(); i++) {
			JsonObject item = new JsonObject();
			item.addProperty("adUrl",data.get(i).getAdUrl());
			item.addProperty("adDetailUrl",data.get(i).getAdDetailUrl());
			item.addProperty("adMsg",data.get(i).getAdMsg());
			item.addProperty("adStoreName",data.get(i).getAdStoreName());
			item.addProperty("adStartDate",data.get(i).getStartDate());
			item.addProperty("adEndDate",data.get(i).getEndDate());

			listItemObj.add(item);
		}
		//
		String jsonData = gson.toJson(listItemObj) ;
		JsonElement element11 = gson.fromJson(jsonData, JsonElement.class);
		resultObj.add("adData" , element11);

		JsonElement element = gson.fromJson(resultObj, JsonElement.class);
		obj.add("result" , element);


		return obj.toString();
	}

	@GetMapping("/getapiintro2")
	public String getApiIntro2(){
		List<introModel2> data = getService.getApiIntro2();
		//
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		//
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty("emgContent" , data.get(0).getEmgContent());
		resultObj.addProperty("emgTitle" ,  data.get(0).getEmgTitle());
		resultObj.addProperty("lastAos" , data.get(0).getLastAos());
		resultObj.addProperty("lastIos" , data.get(0).getLastIos());
		resultObj.addProperty("upMsgAos" , data.get(0).getUpMsgAos());
		resultObj.addProperty("upMsgIos" , data.get(0).getUpMsgIos());
		resultObj.addProperty("upTitleAos" , data.get(0).getUpTitleAos());
		resultObj.addProperty("upTitleIos" , data.get(0).getUpTitleIos());
		resultObj.addProperty("verAos" , data.get(0).getVerAos());
		resultObj.addProperty("verIos" , data.get(0).getVerIos());

		resultObj.addProperty("adData" , data.get(0).getAdData());
		resultObj.addProperty("adItem" , data.get(0).getAdItem());

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


	@RequestMapping(method = RequestMethod.GET, path = "/getapimainbanner")
	public String getApiMainBanner(){
		List<mainBannerItem> data = getService.getApiMainBanner();
		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");

		JsonObject resultObj = new JsonObject();

		Gson gson = new Gson();
//		String jsonData = gson.toJson(data) ;
//		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		
		ArrayList<JsonObject> listItemObj = new ArrayList<>() ;

		for (int i = 0; i < data.size(); i++) {
			if (data.get(i) != null){
				JsonObject item = new JsonObject();
				item.addProperty("adStoreName",data.get(i).getAdStoreName());
				item.addProperty("adNo",data.get(i).getAdNo());
				item.addProperty("adMsg",data.get(i).getAdMsg());
				item.addProperty("imgUrl",data.get(i).getImgUrl());
				item.addProperty("adDetailUrl",data.get(i).getAdDetailUrl());
				item.addProperty("getItemClickUrl",data.get(i).getItemClickUrl());
				item.addProperty("bannerType",data.get(i).getBannerType());

				listItemObj.add(item);
			}
		}
		//
		String jsonData = gson.toJson(listItemObj) ;
		JsonElement element11 = gson.fromJson(jsonData, JsonElement.class);
		resultObj.add("adMainItemData" , element11);


		JsonElement element = gson.fromJson(resultObj, JsonElement.class);
		obj.add("result" , element);


		return obj.toString();
	}


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


	@RequestMapping(method = RequestMethod.GET, path = "/getapinewitem" )
	public String getApiNewItem(@RequestParam("position") int page ){ //, @RequestParam("limitcount") String limitcount = 16

		List<newItemModel> data = getService.getApiNewItem(page);

		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getapicodiitem" )
	public String getApiCodiItem(@RequestParam("position") int page ){

		List<newItemModel> data = getService.getApiCodiItem(page);

		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getapimditem" )
	public String getApiMDItem(@RequestParam("position") int page ){

		List<newItemModel> data = getService.getApiMDItem(page);

		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getadintrobannerlist" )
	public String getAdIntroBannerList(){

		List<AdIntroBannerList> data = getService.getAdIntroBannerList();

		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getsearchlist" )
	public String getSearchList(@RequestParam("text") String text){

		List<searchItemModel> data = getService.getSearchList(text);

		JsonObject obj = new JsonObject();
		obj.addProperty("errCd" , 0);
		obj.addProperty("errMsg" , "");
		Gson gson = new Gson();
		String jsonData = gson.toJson(data) ;
		JsonElement element = gson.fromJson(jsonData, JsonElement.class);
		obj.add("result" , element);

		return obj.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getmainshoprandomitem" )
	public String getMainShopRandomItem(){

		List<mainItemRandomModel> data = getService.getMainShopRandomItem();

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