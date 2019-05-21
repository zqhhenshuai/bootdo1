package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-21 09:06:29
 */
public class WebservelDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//网站名称
	private String title;
	//关键字
	private String guanjianzi;
	//描述
	private String miaoshu;
	//客服电话
	private String lianx;
	//邮箱
	private String youxiang;
	//备案号
	private String beian;
	//版权
	private String yinsi;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：网站名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：网站名称
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：关键字
	 */
	public void setGuanjianzi(String guanjianzi) {
		this.guanjianzi = guanjianzi;
	}
	/**
	 * 获取：关键字
	 */
	public String getGuanjianzi() {
		return guanjianzi;
	}
	/**
	 * 设置：描述
	 */
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	/**
	 * 获取：描述
	 */
	public String getMiaoshu() {
		return miaoshu;
	}
	/**
	 * 设置：客服电话
	 */
	public void setLianx(String lianx) {
		this.lianx = lianx;
	}
	/**
	 * 获取：客服电话
	 */
	public String getLianx() {
		return lianx;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：备案号
	 */
	public void setBeian(String beian) {
		this.beian = beian;
	}
	/**
	 * 获取：备案号
	 */
	public String getBeian() {
		return beian;
	}
	/**
	 * 设置：版权
	 */
	public void setYinsi(String yinsi) {
		this.yinsi = yinsi;
	}
	/**
	 * 获取：版权
	 */
	public String getYinsi() {
		return yinsi;
	}
}
