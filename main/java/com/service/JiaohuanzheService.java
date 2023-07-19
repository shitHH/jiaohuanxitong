package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaohuanzheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaohuanzheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaohuanzheView;


/**
 * 交换者
 *
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanzheService extends IService<JiaohuanzheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaohuanzheVO> selectListVO(Wrapper<JiaohuanzheEntity> wrapper);
   	
   	JiaohuanzheVO selectVO(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
   	
   	List<JiaohuanzheView> selectListView(Wrapper<JiaohuanzheEntity> wrapper);
   	
   	JiaohuanzheView selectView(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaohuanzheEntity> wrapper);
   	
}

