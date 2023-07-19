package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaohuanshenqingDao;
import com.entity.JiaohuanshenqingEntity;
import com.service.JiaohuanshenqingService;
import com.entity.vo.JiaohuanshenqingVO;
import com.entity.view.JiaohuanshenqingView;

@Service("jiaohuanshenqingService")
public class JiaohuanshenqingServiceImpl extends ServiceImpl<JiaohuanshenqingDao, JiaohuanshenqingEntity> implements JiaohuanshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaohuanshenqingEntity> page = this.selectPage(
                new Query<JiaohuanshenqingEntity>(params).getPage(),
                new EntityWrapper<JiaohuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaohuanshenqingEntity> wrapper) {
		  Page<JiaohuanshenqingView> page =new Query<JiaohuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaohuanshenqingVO> selectListVO(Wrapper<JiaohuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaohuanshenqingVO selectVO(Wrapper<JiaohuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaohuanshenqingView> selectListView(Wrapper<JiaohuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaohuanshenqingView selectView(Wrapper<JiaohuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
