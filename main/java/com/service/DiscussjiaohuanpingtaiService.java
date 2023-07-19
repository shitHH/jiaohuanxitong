package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaohuanpingtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaohuanpingtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaohuanpingtaiView;


/**
 * 交换平台评论表
 *
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface DiscussjiaohuanpingtaiService extends IService<DiscussjiaohuanpingtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaohuanpingtaiVO> selectListVO(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
   	
   	DiscussjiaohuanpingtaiVO selectVO(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
   	
   	List<DiscussjiaohuanpingtaiView> selectListView(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
   	
   	DiscussjiaohuanpingtaiView selectView(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
   	
}

