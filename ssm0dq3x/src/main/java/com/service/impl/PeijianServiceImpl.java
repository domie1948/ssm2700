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


import com.dao.PeijianDao;
import com.entity.PeijianEntity;
import com.service.PeijianService;
import com.entity.vo.PeijianVO;
import com.entity.view.PeijianView;

@Service("peijianService")
public class PeijianServiceImpl extends ServiceImpl<PeijianDao, PeijianEntity> implements PeijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeijianEntity> page = this.selectPage(
                new Query<PeijianEntity>(params).getPage(),
                new EntityWrapper<PeijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeijianEntity> wrapper) {
		  Page<PeijianView> page =new Query<PeijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeijianVO> selectListVO(Wrapper<PeijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeijianVO selectVO(Wrapper<PeijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeijianView> selectListView(Wrapper<PeijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeijianView selectView(Wrapper<PeijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
