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


import com.dao.DiscussjiaohuanpingtaiDao;
import com.entity.DiscussjiaohuanpingtaiEntity;
import com.service.DiscussjiaohuanpingtaiService;
import com.entity.vo.DiscussjiaohuanpingtaiVO;
import com.entity.view.DiscussjiaohuanpingtaiView;

@Service("discussjiaohuanpingtaiService")
public class DiscussjiaohuanpingtaiServiceImpl extends ServiceImpl<DiscussjiaohuanpingtaiDao, DiscussjiaohuanpingtaiEntity> implements DiscussjiaohuanpingtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaohuanpingtaiEntity> page = this.selectPage(
                new Query<DiscussjiaohuanpingtaiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaohuanpingtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaohuanpingtaiEntity> wrapper) {
		  Page<DiscussjiaohuanpingtaiView> page =new Query<DiscussjiaohuanpingtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaohuanpingtaiVO> selectListVO(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaohuanpingtaiVO selectVO(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaohuanpingtaiView> selectListView(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaohuanpingtaiView selectView(Wrapper<DiscussjiaohuanpingtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
