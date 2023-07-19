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

import com.entity.JiaohuanpingtaiEntity;
import com.entity.view.JiaohuanpingtaiView;

import com.service.JiaohuanpingtaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 交换平台
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-28 00:35:26
 */
@RestController
@RequestMapping("/jiaohuanpingtai")
public class JiaohuanpingtaiController {
    @Autowired
    private JiaohuanpingtaiService jiaohuanpingtaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaohuanpingtaiEntity jiaohuanpingtai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			jiaohuanpingtai.setFabuzheyonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaohuanpingtaiEntity> ew = new EntityWrapper<JiaohuanpingtaiEntity>();
		PageUtils page = jiaohuanpingtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaohuanpingtai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaohuanpingtaiEntity jiaohuanpingtai, HttpServletRequest request){
        EntityWrapper<JiaohuanpingtaiEntity> ew = new EntityWrapper<JiaohuanpingtaiEntity>();
		PageUtils page = jiaohuanpingtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaohuanpingtai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaohuanpingtaiEntity jiaohuanpingtai){
       	EntityWrapper<JiaohuanpingtaiEntity> ew = new EntityWrapper<JiaohuanpingtaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaohuanpingtai, "jiaohuanpingtai")); 
        return R.ok().put("data", jiaohuanpingtaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaohuanpingtaiEntity jiaohuanpingtai){
        EntityWrapper< JiaohuanpingtaiEntity> ew = new EntityWrapper< JiaohuanpingtaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaohuanpingtai, "jiaohuanpingtai")); 
		JiaohuanpingtaiView jiaohuanpingtaiView =  jiaohuanpingtaiService.selectView(ew);
		return R.ok("查询交换平台成功").put("data", jiaohuanpingtaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaohuanpingtaiEntity jiaohuanpingtai = jiaohuanpingtaiService.selectById(id);
        return R.ok().put("data", jiaohuanpingtai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaohuanpingtaiEntity jiaohuanpingtai = jiaohuanpingtaiService.selectById(id);
        return R.ok().put("data", jiaohuanpingtai);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JiaohuanpingtaiEntity jiaohuanpingtai = jiaohuanpingtaiService.selectById(id);
        if(type.equals("1")) {
        	jiaohuanpingtai.setThumbsupnum(jiaohuanpingtai.getThumbsupnum()+1);
        } else {
        	jiaohuanpingtai.setCrazilynum(jiaohuanpingtai.getCrazilynum()+1);
        }
        jiaohuanpingtaiService.updateById(jiaohuanpingtai);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaohuanpingtaiEntity jiaohuanpingtai, HttpServletRequest request){
    	jiaohuanpingtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaohuanpingtai);
        jiaohuanpingtaiService.insert(jiaohuanpingtai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaohuanpingtaiEntity jiaohuanpingtai, HttpServletRequest request){
    	jiaohuanpingtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaohuanpingtai);
        jiaohuanpingtaiService.insert(jiaohuanpingtai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaohuanpingtaiEntity jiaohuanpingtai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaohuanpingtai);
        jiaohuanpingtaiService.updateById(jiaohuanpingtai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaohuanpingtaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiaohuanpingtaiEntity> wrapper = new EntityWrapper<JiaohuanpingtaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			wrapper.eq("fabuzheyonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaohuanpingtaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
