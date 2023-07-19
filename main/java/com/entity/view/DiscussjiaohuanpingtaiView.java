package com.entity.view;

import com.entity.DiscussjiaohuanpingtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交换平台评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@TableName("discussjiaohuanpingtai")
public class DiscussjiaohuanpingtaiView  extends DiscussjiaohuanpingtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaohuanpingtaiView(){
	}
 
 	public DiscussjiaohuanpingtaiView(DiscussjiaohuanpingtaiEntity discussjiaohuanpingtaiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaohuanpingtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
