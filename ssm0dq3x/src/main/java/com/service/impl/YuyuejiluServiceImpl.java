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


import com.dao.YuyuejiluDao;
import com.entity.YuyuejiluEntity;
import com.service.YuyuejiluService;
import com.entity.vo.YuyuejiluVO;
import com.entity.view.YuyuejiluView;

@Service("yuyuejiluService")
public class YuyuejiluServiceImpl extends ServiceImpl<YuyuejiluDao, YuyuejiluEntity> implements YuyuejiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuejiluEntity> page = this.selectPage(
                new Query<YuyuejiluEntity>(params).getPage(),
                new EntityWrapper<YuyuejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuejiluEntity> wrapper) {
		  Page<YuyuejiluView> page =new Query<YuyuejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuejiluVO> selectListVO(Wrapper<YuyuejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuejiluVO selectVO(Wrapper<YuyuejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuejiluView> selectListView(Wrapper<YuyuejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuejiluView selectView(Wrapper<YuyuejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
