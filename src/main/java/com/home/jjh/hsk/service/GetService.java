package com.home.jjh.hsk.service;

import com.home.jjh.hsk.mapper.SelectMapper;
import com.home.jjh.hsk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//계산 로직등..
@Service
public class GetService {

	@Autowired
	private SelectMapper selectMapper;
	/*user data*/
	public userModel getApiUser(@RequestParam("email") String email){
		return selectMapper.getApiUser(email);
	}
	/*user data*/
	public List<adModel> getApiAd(){return selectMapper.getApiAd();}
	/*user data*/
	public List<introModel> getApiIntro(){
		return selectMapper.getApiIntro();
	}
	public List<introModel2> getApiIntro2(){
		return selectMapper.getApiIntro2();
	}

	public List<eventModel> getApiEvent(){
		return selectMapper.getApiEvent();
	}
	public List<itemModel> getApiItem(){
		return selectMapper.getApiItem();
	}
	public List<adDataModel> getApiAdDataItem(){
		return selectMapper.getApiAdDataItem();
	}
	public List<shopsModel> getApiShopsDataItem(){
		return selectMapper.getApiShopsDataItem();
	}
	public List<mainBannerItem> getApiMainBanner(){ return selectMapper.getApiMainBanner();}
	public testJoinModel getApiTestJoin(){
		return selectMapper.getApiTestJoin();
	}

	public List<newItemModel> getApiNewItem(@RequestParam("position") int page ){
		return selectMapper.getApiNewItem(page);
	}

	public List<newItemModel> getApiCodiItem(@RequestParam("position") int page ){
		return selectMapper.getApiCodiItem(page);
	}

	public List<newItemModel> getApiMDItem(@RequestParam("position") int page ){
		return selectMapper.getApiMDItem(page);
	}

	public List<AdIntroBannerList> getAdIntroBannerList(){
		return selectMapper.getAdIntroBannerList();
	}

}
