package com.entity.model;

import com.entity.JiaohuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 交换申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public class JiaohuanshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品类型
	 */
	
	private String wupinleixing;
		
	/**
	 * 物品详细
	 */
	
	private String wupinxiangxi;
		
	/**
	 * 理想交换物
	 */
	
	private String lixiangjiaohuanwu;
		
	/**
	 * 发布者用户名
	 */
	
	private String fabuzheyonghuming;
		
	/**
	 * 发布者姓名
	 */
	
	private String fabuzhexingming;
		
	/**
	 * 交换者用户名
	 */
	
	private String jiaohuanzheyonghuming;
		
	/**
	 * 交换者姓名
	 */
	
	private String jiaohuanzhexingming;
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品类型
	 */
	 
	public void setWupinleixing(String wupinleixing) {
		this.wupinleixing = wupinleixing;
	}
	
	/**
	 * 获取：物品类型
	 */
	public String getWupinleixing() {
		return wupinleixing;
	}
				
	
	/**
	 * 设置：物品详细
	 */
	 
	public void setWupinxiangxi(String wupinxiangxi) {
		this.wupinxiangxi = wupinxiangxi;
	}
	
	/**
	 * 获取：物品详细
	 */
	public String getWupinxiangxi() {
		return wupinxiangxi;
	}
				
	
	/**
	 * 设置：理想交换物
	 */
	 
	public void setLixiangjiaohuanwu(String lixiangjiaohuanwu) {
		this.lixiangjiaohuanwu = lixiangjiaohuanwu;
	}
	
	/**
	 * 获取：理想交换物
	 */
	public String getLixiangjiaohuanwu() {
		return lixiangjiaohuanwu;
	}
				
	
	/**
	 * 设置：发布者用户名
	 */
	 
	public void setFabuzheyonghuming(String fabuzheyonghuming) {
		this.fabuzheyonghuming = fabuzheyonghuming;
	}
	
	/**
	 * 获取：发布者用户名
	 */
	public String getFabuzheyonghuming() {
		return fabuzheyonghuming;
	}
				
	
	/**
	 * 设置：发布者姓名
	 */
	 
	public void setFabuzhexingming(String fabuzhexingming) {
		this.fabuzhexingming = fabuzhexingming;
	}
	
	/**
	 * 获取：发布者姓名
	 */
	public String getFabuzhexingming() {
		return fabuzhexingming;
	}
				
	
	/**
	 * 设置：交换者用户名
	 */
	 
	public void setJiaohuanzheyonghuming(String jiaohuanzheyonghuming) {
		this.jiaohuanzheyonghuming = jiaohuanzheyonghuming;
	}
	
	/**
	 * 获取：交换者用户名
	 */
	public String getJiaohuanzheyonghuming() {
		return jiaohuanzheyonghuming;
	}
				
	
	/**
	 * 设置：交换者姓名
	 */
	 
	public void setJiaohuanzhexingming(String jiaohuanzhexingming) {
		this.jiaohuanzhexingming = jiaohuanzhexingming;
	}
	
	/**
	 * 获取：交换者姓名
	 */
	public String getJiaohuanzhexingming() {
		return jiaohuanzhexingming;
	}
			
}
