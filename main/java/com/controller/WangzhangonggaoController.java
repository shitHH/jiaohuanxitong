package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WangzhangonggaoEntity;
import com.entity.view.WangzhangonggaoView;

import com.service.WangzhangonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 网站公告
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@RestController
@RequestMapping("/wangzhangonggao")
public class WangzhangonggaoController {
    @Autowired
    private WangzhangonggaoService wangzhangonggaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WangzhangonggaoEntity wangzhangonggao,
		@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fabushijianstart, 
    		@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<WangzhangonggaoEntity> ew = new EntityWrapper<WangzhangonggaoEntity>();
		if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
        	if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = wangzhangonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wangzhangonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WangzhangonggaoEntity wangzhangonggao, HttpServletRequest request){
        EntityWrapper<WangzhangonggaoEntity> ew = new EntityWrapper<WangzhangonggaoEntity>();
		PageUtils page = wangzhangonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wangzhangonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WangzhangonggaoEntity wangzhangonggao){
       	EntityWrapper<WangzhangonggaoEntity> ew = new EntityWrapper<WangzhangonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wangzhangonggao, "wangzhangonggao")); 
        return R.ok().put("data", wangzhangonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WangzhangonggaoEntity wangzhangonggao){
        EntityWrapper< WangzhangonggaoEntity> ew = new EntityWrapper< WangzhangonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wangzhangonggao, "wangzhangonggao")); 
		WangzhangonggaoView wangzhangonggaoView =  wangzhangonggaoService.selectView(ew);
		return R.ok("查询网站公告成功").put("data", wangzhangonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WangzhangonggaoEntity wangzhangonggao = wangzhangonggaoService.selectById(id);
        return R.ok().put("data", wangzhangonggao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WangzhangonggaoEntity wangzhangonggao = wangzhangonggaoService.selectById(id);
        return R.ok().put("data", wangzhangonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WangzhangonggaoEntity wangzhangonggao, HttpServletRequest request){
    	wangzhangonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wangzhangonggao);
        wangzhangonggaoService.insert(wangzhangonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WangzhangonggaoEntity wangzhangonggao, HttpServletRequest request){
    	wangzhangonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wangzhangonggao);
        wangzhangonggaoService.insert(wangzhangonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WangzhangonggaoEntity wangzhangonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wangzhangonggao);
        wangzhangonggaoService.updateById(wangzhangonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wangzhangonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WangzhangonggaoEntity> wrapper = new EntityWrapper<WangzhangonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wangzhangonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
