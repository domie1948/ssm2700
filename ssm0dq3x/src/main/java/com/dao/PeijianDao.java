package com.dao;

import com.entity.PeijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijianVO;
import com.entity.view.PeijianView;


/**
 * 配件
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface PeijianDao extends BaseMapper<PeijianEntity> {
	
	List<PeijianVO> selectListVO(@Param("ew") Wrapper<PeijianEntity> wrapper);
	
	PeijianVO selectVO(@Param("ew") Wrapper<PeijianEntity> wrapper);
	
	List<PeijianView> selectListView(@Param("ew") Wrapper<PeijianEntity> wrapper);

	List<PeijianView> selectListView(Pagination page,@Param("ew") Wrapper<PeijianEntity> wrapper);
	
	PeijianView selectView(@Param("ew") Wrapper<PeijianEntity> wrapper);
	
}
