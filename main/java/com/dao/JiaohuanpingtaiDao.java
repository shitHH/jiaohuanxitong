package com.dao;

import com.entity.JiaohuanpingtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaohuanpingtaiVO;
import com.entity.view.JiaohuanpingtaiView;


/**
 * 交换平台
 * 
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanpingtaiDao extends BaseMapper<JiaohuanpingtaiEntity> {
	
	List<JiaohuanpingtaiVO> selectListVO(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
	
	JiaohuanpingtaiVO selectVO(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
	
	List<JiaohuanpingtaiView> selectListView(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);

	List<JiaohuanpingtaiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
	
	JiaohuanpingtaiView selectView(@Param("ew") Wrapper<JiaohuanpingtaiEntity> wrapper);
	
}
