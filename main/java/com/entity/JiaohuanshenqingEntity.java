package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 交换申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@TableName("jiaohuanshenqing")
public class JiaohuanshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaohuanshenqingEntity() {
		
	}
	
	public JiaohuanshenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 物品编号
	 */
					
	private String wupinbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：物品编号
	 */
	public void setWupinbianhao(String wupinbianhao) {
		this.wupinbianhao = wupinbianhao;
	}
	/**
	 * 获取：物品编号
	 */
	public String getWupinbianhao() {
		return wupinbianhao;
	}
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
