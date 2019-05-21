package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.WebservelDao;
import com.bootdo.system.domain.WebservelDO;
import com.bootdo.system.service.WebservelService;



@Service
public class WebservelServiceImpl implements WebservelService {
	@Autowired
	private WebservelDao webservelDao;
	
	@Override
	public WebservelDO get(Integer id){
		return webservelDao.get(id);
	}
	
	@Override
	public List<WebservelDO> list(Map<String, Object> map){
		return webservelDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return webservelDao.count(map);
	}
	
	@Override
	public int save(WebservelDO webservel){
		return webservelDao.save(webservel);
	}
	
	@Override
	public int update(WebservelDO webservel){
		return webservelDao.update(webservel);
	}
	
	@Override
	public int remove(Integer id){
		return webservelDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return webservelDao.batchRemove(ids);
	}
	
}
