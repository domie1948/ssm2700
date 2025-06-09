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


import com.dao.QichefenleiDao;
import com.entity.QichefenleiEntity;
import com.service.QichefenleiService;
import com.entity.vo.QichefenleiVO;
import com.entity.view.QichefenleiView;

@Service("qichefenleiService")
public class QichefenleiServiceImpl extends ServiceImpl<QichefenleiDao, QichefenleiEntity> implements QichefenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichefenleiEntity> page = this.selectPage(
                new Query<QichefenleiEntity>(params).getPage(),
                new EntityWrapper<QichefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichefenleiEntity> wrapper) {
		  Page<QichefenleiView> page =new Query<QichefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichefenleiVO> selectListVO(Wrapper<QichefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichefenleiVO selectVO(Wrapper<QichefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichefenleiView> selectListView(Wrapper<QichefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichefenleiView selectView(Wrapper<QichefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
