package com.entity.view;

import com.entity.JiaohuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交换申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@TableName("jiaohuanshenqing")
public class JiaohuanshenqingView  extends JiaohuanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaohuanshenqingView(){
	}
 
 	public JiaohuanshenqingView(JiaohuanshenqingEntity jiaohuanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaohuanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
