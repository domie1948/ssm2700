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


import com.dao.DiscussqicheDao;
import com.entity.DiscussqicheEntity;
import com.service.DiscussqicheService;
import com.entity.vo.DiscussqicheVO;
import com.entity.view.DiscussqicheView;

@Service("discussqicheService")
public class DiscussqicheServiceImpl extends ServiceImpl<DiscussqicheDao, DiscussqicheEntity> implements DiscussqicheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqicheEntity> page = this.selectPage(
                new Query<DiscussqicheEntity>(params).getPage(),
                new EntityWrapper<DiscussqicheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqicheEntity> wrapper) {
		  Page<DiscussqicheView> page =new Query<DiscussqicheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqicheVO> selectListVO(Wrapper<DiscussqicheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqicheVO selectVO(Wrapper<DiscussqicheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqicheView> selectListView(Wrapper<DiscussqicheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqicheView selectView(Wrapper<DiscussqicheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
