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


import com.dao.QichemeirongDao;
import com.entity.QichemeirongEntity;
import com.service.QichemeirongService;
import com.entity.vo.QichemeirongVO;
import com.entity.view.QichemeirongView;

@Service("qichemeirongService")
public class QichemeirongServiceImpl extends ServiceImpl<QichemeirongDao, QichemeirongEntity> implements QichemeirongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichemeirongEntity> page = this.selectPage(
                new Query<QichemeirongEntity>(params).getPage(),
                new EntityWrapper<QichemeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichemeirongEntity> wrapper) {
		  Page<QichemeirongView> page =new Query<QichemeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichemeirongVO> selectListVO(Wrapper<QichemeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichemeirongVO selectVO(Wrapper<QichemeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichemeirongView> selectListView(Wrapper<QichemeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichemeirongView selectView(Wrapper<QichemeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
