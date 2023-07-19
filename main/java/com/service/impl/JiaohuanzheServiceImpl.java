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


import com.dao.JiaohuanzheDao;
import com.entity.JiaohuanzheEntity;
import com.service.JiaohuanzheService;
import com.entity.vo.JiaohuanzheVO;
import com.entity.view.JiaohuanzheView;

@Service("jiaohuanzheService")
public class JiaohuanzheServiceImpl extends ServiceImpl<JiaohuanzheDao, JiaohuanzheEntity> implements JiaohuanzheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaohuanzheEntity> page = this.selectPage(
                new Query<JiaohuanzheEntity>(params).getPage(),
                new EntityWrapper<JiaohuanzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaohuanzheEntity> wrapper) {
		  Page<JiaohuanzheView> page =new Query<JiaohuanzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaohuanzheVO> selectListVO(Wrapper<JiaohuanzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaohuanzheVO selectVO(Wrapper<JiaohuanzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaohuanzheView> selectListView(Wrapper<JiaohuanzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaohuanzheView selectView(Wrapper<JiaohuanzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
