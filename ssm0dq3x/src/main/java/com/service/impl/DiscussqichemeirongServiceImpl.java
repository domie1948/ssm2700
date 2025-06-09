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


import com.dao.DiscussqichemeirongDao;
import com.entity.DiscussqichemeirongEntity;
import com.service.DiscussqichemeirongService;
import com.entity.vo.DiscussqichemeirongVO;
import com.entity.view.DiscussqichemeirongView;

@Service("discussqichemeirongService")
public class DiscussqichemeirongServiceImpl extends ServiceImpl<DiscussqichemeirongDao, DiscussqichemeirongEntity> implements DiscussqichemeirongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqichemeirongEntity> page = this.selectPage(
                new Query<DiscussqichemeirongEntity>(params).getPage(),
                new EntityWrapper<DiscussqichemeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqichemeirongEntity> wrapper) {
		  Page<DiscussqichemeirongView> page =new Query<DiscussqichemeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqichemeirongVO> selectListVO(Wrapper<DiscussqichemeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqichemeirongVO selectVO(Wrapper<DiscussqichemeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqichemeirongView> selectListView(Wrapper<DiscussqichemeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqichemeirongView selectView(Wrapper<DiscussqichemeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
