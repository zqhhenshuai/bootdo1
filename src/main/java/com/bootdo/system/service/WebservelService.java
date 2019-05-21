package com.bootdo.system.service;

import com.bootdo.system.domain.WebservelDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-21 09:06:29
 */
public interface WebservelService {
	
	WebservelDO get(Integer id);
	
	List<WebservelDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WebservelDO webservel);
	
	int update(WebservelDO webservel);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
