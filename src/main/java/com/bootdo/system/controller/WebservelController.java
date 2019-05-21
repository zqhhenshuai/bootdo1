package com.bootdo.system.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.system.domain.WebservelDO;
import com.bootdo.system.service.WebservelService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-21 09:06:29
 */
 
@Controller
@RequestMapping("/system/webservel")
public class WebservelController {
	@Autowired
	private WebservelService webservelService;
	
	@GetMapping()
	@RequiresPermissions("system:webservel:webservel")
	String Webservel(){
	    return "system/webservel/webservel";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:webservel:webservel")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WebservelDO> webservelList = webservelService.list(query);
		int total = webservelService.count(query);
		PageUtils pageUtils = new PageUtils(webservelList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:webservel:add")
	String add(){
	    return "system/webservel/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:webservel:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		WebservelDO webservel = webservelService.get(id);
		model.addAttribute("webservel", webservel);
	    return "system/webservel/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:webservel:add")
	public R save( WebservelDO webservel){
		if(webservelService.save(webservel)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:webservel:edit")
	public R update( WebservelDO webservel){
		webservelService.update(webservel);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:webservel:remove")
	public R remove( Integer id){
		if(webservelService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:webservel:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		webservelService.batchRemove(ids);
		return R.ok();
	}
	
}
