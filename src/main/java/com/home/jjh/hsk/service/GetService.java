package com.home.jjh.hsk.service;

import com.home.jjh.hsk.mapper.SelectMapper;
import com.home.jjh.hsk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class GetService {

	@Autowired
	private SelectMapper selectMapper;

	/*user data*/
	public List<userModel> getApiUser(@RequestParam("email") String email){
		return selectMapper.getApiUser(email);

	}

	/*user data*/
	public List<adModel> getApiAd(){
		return selectMapper.getApiAd();

	}

	/*user data*/
	public List<introModel> getApiIntro(){
		return selectMapper.getApiIntro();
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


}