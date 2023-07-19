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


import com.dao.JiaohuanpingtaiDao;
import com.entity.JiaohuanpingtaiEntity;
import com.service.JiaohuanpingtaiService;
import com.entity.vo.JiaohuanpingtaiVO;
import com.entity.view.JiaohuanpingtaiView;

@Service("jiaohuanpingtaiService")
public class JiaohuanpingtaiServiceImpl extends ServiceImpl<JiaohuanpingtaiDao, JiaohuanpingtaiEntity> implements JiaohuanpingtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaohuanpingtaiEntity> page = this.selectPage(
                new Query<JiaohuanpingtaiEntity>(params).getPage(),
                new EntityWrapper<JiaohuanpingtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaohuanpingtaiEntity> wrapper) {
		  Page<JiaohuanpingtaiView> page =new Query<JiaohuanpingtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaohuanpingtaiVO> selectListVO(Wrapper<JiaohuanpingtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaohuanpingtaiVO selectVO(Wrapper<JiaohuanpingtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaohuanpingtaiView> selectListView(Wrapper<JiaohuanpingtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaohuanpingtaiView selectView(Wrapper<JiaohuanpingtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
