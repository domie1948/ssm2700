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


import com.dao.QicheDao;
import com.entity.QicheEntity;
import com.service.QicheService;
import com.entity.vo.QicheVO;
import com.entity.view.QicheView;

@Service("qicheService")
public class QicheServiceImpl extends ServiceImpl<QicheDao, QicheEntity> implements QicheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheEntity> page = this.selectPage(
                new Query<QicheEntity>(params).getPage(),
                new EntityWrapper<QicheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheEntity> wrapper) {
		  Page<QicheView> page =new Query<QicheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheVO> selectListVO(Wrapper<QicheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheVO selectVO(Wrapper<QicheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheView> selectListView(Wrapper<QicheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheView selectView(Wrapper<QicheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
