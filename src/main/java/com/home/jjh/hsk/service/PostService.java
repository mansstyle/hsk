package com.home.jjh.hsk.service;

import com.home.jjh.hsk.mapper.InsertMapper;
import com.home.jjh.hsk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PostService {

	@Autowired
	private InsertMapper insertMapper;

	public List<userModel> setApiUser(userModel userModel){
		return insertMapper.setApiUser(userModel);
	}

	public void setApiMainBannerItem(mainBannerItem mainBannerItem){insertMapper.setApiMainBannerItem(mainBannerItem);}
	public void inserShop (shopsModel shopsModel){insertMapper.insertShop(shopsModel);}
	public void insertNewItem (itemModel itemModel){insertMapper.insertNewItem(itemModel);}
	public void insertItemDetail (itemDetailModel itemDetailModel){insertMapper.insertItemDetail(itemDetailModel);}
	public void insertEvent (eventModel eventModel){insertMapper.insertEvent(eventModel);}

	public void insertTbScore (tbScoreModel tbScoreModel){insertMapper.insertTbScore(tbScoreModel);}

}