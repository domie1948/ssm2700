package com.dao;

import com.entity.WeixiubaoyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiubaoyangVO;
import com.entity.view.WeixiubaoyangView;


/**
 * 维修保养
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface WeixiubaoyangDao extends BaseMapper<WeixiubaoyangEntity> {
	
	List<WeixiubaoyangVO> selectListVO(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
	
	WeixiubaoyangVO selectVO(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
	
	List<WeixiubaoyangView> selectListView(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);

	List<WeixiubaoyangView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
	
	WeixiubaoyangView selectView(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
	
}
