package com.dao;

import com.entity.DiscussjiaohuanpingtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaohuanpingtaiVO;
import com.entity.view.DiscussjiaohuanpingtaiView;


/**
 * 交换平台评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface DiscussjiaohuanpingtaiDao extends BaseMapper<DiscussjiaohuanpingtaiEntity> {
	
	List<DiscussjiaohuanpingtaiVO> selectListVO(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
	
	DiscussjiaohuanpingtaiVO selectVO(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
	
	List<DiscussjiaohuanpingtaiView> selectListView(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);

	List<DiscussjiaohuanpingtaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
	
	DiscussjiaohuanpingtaiView selectView(@Param("ew") Wrapper<DiscussjiaohuanpingtaiEntity> wrapper);
	
}
