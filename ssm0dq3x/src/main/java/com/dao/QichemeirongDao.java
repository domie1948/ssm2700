package com.dao;

import com.entity.QichemeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichemeirongVO;
import com.entity.view.QichemeirongView;


/**
 * 汽车美容
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface QichemeirongDao extends BaseMapper<QichemeirongEntity> {
	
	List<QichemeirongVO> selectListVO(@Param("ew") Wrapper<QichemeirongEntity> wrapper);
	
	QichemeirongVO selectVO(@Param("ew") Wrapper<QichemeirongEntity> wrapper);
	
	List<QichemeirongView> selectListView(@Param("ew") Wrapper<QichemeirongEntity> wrapper);

	List<QichemeirongView> selectListView(Pagination page,@Param("ew") Wrapper<QichemeirongEntity> wrapper);
	
	QichemeirongView selectView(@Param("ew") Wrapper<QichemeirongEntity> wrapper);
	
}
