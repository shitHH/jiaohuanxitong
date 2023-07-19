package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaohuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaohuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaohuanshenqingView;


/**
 * 交换申请
 *
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanshenqingService extends IService<JiaohuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaohuanshenqingVO> selectListVO(Wrapper<JiaohuanshenqingEntity> wrapper);
   	
   	JiaohuanshenqingVO selectVO(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
   	
   	List<JiaohuanshenqingView> selectListView(Wrapper<JiaohuanshenqingEntity> wrapper);
   	
   	JiaohuanshenqingView selectView(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaohuanshenqingEntity> wrapper);
   	
}

