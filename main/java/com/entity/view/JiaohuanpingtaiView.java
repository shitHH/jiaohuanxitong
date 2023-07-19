package com.entity.view;

import com.entity.JiaohuanpingtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交换平台
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@TableName("jiaohuanpingtai")
public class JiaohuanpingtaiView  extends JiaohuanpingtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaohuanpingtaiView(){
	}
 
 	public JiaohuanpingtaiView(JiaohuanpingtaiEntity jiaohuanpingtaiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaohuanpingtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
