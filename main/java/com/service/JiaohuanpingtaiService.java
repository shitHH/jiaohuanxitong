package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaohuanpingtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaohuanpingtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaohuanpingtaiView;


/**
 * 交换平台
 *
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanpingtaiService extends IService<JiaohuanpingtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaohuanpingtaiVO> selectListVO(Wrapper<JiaohuanpingtaiEntity> wrapper);
   	
   	JiaohuanpingtaiVO selectVO(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
   	
   	List<JiaohuanpingtaiView> selectListView(Wrapper<JiaohuanpingtaiEntity> wrapper);
   	
   	JiaohuanpingtaiView selectView(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaohuanpingtaiEntity> wrapper);
   	
}

