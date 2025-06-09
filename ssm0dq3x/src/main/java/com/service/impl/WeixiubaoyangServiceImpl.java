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


import com.dao.WeixiubaoyangDao;
import com.entity.WeixiubaoyangEntity;
import com.service.WeixiubaoyangService;
import com.entity.vo.WeixiubaoyangVO;
import com.entity.view.WeixiubaoyangView;

@Service("weixiubaoyangService")
public class WeixiubaoyangServiceImpl extends ServiceImpl<WeixiubaoyangDao, WeixiubaoyangEntity> implements WeixiubaoyangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiubaoyangEntity> page = this.selectPage(
                new Query<WeixiubaoyangEntity>(params).getPage(),
                new EntityWrapper<WeixiubaoyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiubaoyangEntity> wrapper) {
		  Page<WeixiubaoyangView> page =new Query<WeixiubaoyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiubaoyangVO> selectListVO(Wrapper<WeixiubaoyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiubaoyangVO selectVO(Wrapper<WeixiubaoyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiubaoyangView> selectListView(Wrapper<WeixiubaoyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiubaoyangView selectView(Wrapper<WeixiubaoyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
