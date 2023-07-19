package com.dao;

import com.entity.JiaohuanzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaohuanzheVO;
import com.entity.view.JiaohuanzheView;


/**
 * 交换者
 * 
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
public interface JiaohuanzheDao extends BaseMapper<JiaohuanzheEntity> {
	
	List<JiaohuanzheVO> selectListVO(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
	
	JiaohuanzheVO selectVO(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
	
	List<JiaohuanzheView> selectListView(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);

	List<JiaohuanzheView> selectListView(Pagination page,@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
	
	JiaohuanzheView selectView(@Param("ew") Wrapper<JiaohuanzheEntity> wrapper);
	
}
