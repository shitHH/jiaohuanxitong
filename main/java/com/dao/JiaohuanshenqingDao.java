package com.dao;

import com.entity.JiaohuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaohuanshenqingVO;
import com.entity.view.JiaohuanshenqingView;


/**
 * 交换申请
 * 
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanshenqingDao extends BaseMapper<JiaohuanshenqingEntity> {
	
	List<JiaohuanshenqingVO> selectListVO(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
	
	JiaohuanshenqingVO selectVO(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
	
	List<JiaohuanshenqingView> selectListView(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);

	List<JiaohuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
	
	JiaohuanshenqingView selectView(@Param("ew") Wrapper<JiaohuanshenqingEntity> wrapper);
	
}
