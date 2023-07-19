package com.entity.vo;

import com.entity.JiaohuanpingtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 交换平台
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public class JiaohuanpingtaiVO  implements Serializable {
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
	 * 物品图片
	 */
	
	private String wupintupian;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
