package com.dao;

import com.entity.QicheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheVO;
import com.entity.view.QicheView;


/**
 * 汽车
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface QicheDao extends BaseMapper<QicheEntity> {
	
	List<QicheVO> selectListVO(@Param("ew") Wrapper<QicheEntity> wrapper);
	
	QicheVO selectVO(@Param("ew") Wrapper<QicheEntity> wrapper);
	
	List<QicheView> selectListView(@Param("ew") Wrapper<QicheEntity> wrapper);

	List<QicheView> selectListView(Pagination page,@Param("ew") Wrapper<QicheEntity> wrapper);
	
	QicheView selectView(@Param("ew") Wrapper<QicheEntity> wrapper);
	
}
