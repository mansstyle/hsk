package com.home.jjh.hsk.service;

import com.home.jjh.hsk.mapper.InsertMapper;
import com.home.jjh.hsk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	private InsertMapper insertMapper;

	public void setApiUser(userModel userModel){insertMapper.setApiUser(userModel);}
	public void setApiMainBannerItem(mainBannerItem mainBannerItem){insertMapper.setApiMainBannerItem(mainBannerItem) ;}
	public void inserShop (shopsModel shopsModel){insertMapper.insertShop(shopsModel);}
	public void insertNewItem (itemModel itemModel){insertMapper.insertNewItem(itemModel);}
	public void insertItemDetail (itemDetailModel itemDetailModel){insertMapper.insertItemDetail(itemDetailModel);}
	public void insertEvent (eventModel eventModel){insertMapper.insertEvent(eventModel);}

//	public String insertEvent (eventModel eventModel){
//		return insertMapper.insertEvent(eventModel).toString();
//	}
}