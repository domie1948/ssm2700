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


import com.dao.ShouhoufuwuDao;
import com.entity.ShouhoufuwuEntity;
import com.service.ShouhoufuwuService;
import com.entity.vo.ShouhoufuwuVO;
import com.entity.view.ShouhoufuwuView;

@Service("shouhoufuwuService")
public class ShouhoufuwuServiceImpl extends ServiceImpl<ShouhoufuwuDao, ShouhoufuwuEntity> implements ShouhoufuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouhoufuwuEntity> page = this.selectPage(
                new Query<ShouhoufuwuEntity>(params).getPage(),
                new EntityWrapper<ShouhoufuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouhoufuwuEntity> wrapper) {
		  Page<ShouhoufuwuView> page =new Query<ShouhoufuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouhoufuwuVO> selectListVO(Wrapper<ShouhoufuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouhoufuwuVO selectVO(Wrapper<ShouhoufuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouhoufuwuView> selectListView(Wrapper<ShouhoufuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouhoufuwuView selectView(Wrapper<ShouhoufuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
