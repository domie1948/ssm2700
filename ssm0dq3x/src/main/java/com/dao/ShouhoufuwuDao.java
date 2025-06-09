package com.dao;

import com.entity.ShouhoufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhoufuwuVO;
import com.entity.view.ShouhoufuwuView;


/**
 * 售后服务
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface ShouhoufuwuDao extends BaseMapper<ShouhoufuwuEntity> {
	
	List<ShouhoufuwuVO> selectListVO(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
	
	ShouhoufuwuVO selectVO(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
	
	List<ShouhoufuwuView> selectListView(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);

	List<ShouhoufuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
	
	ShouhoufuwuView selectView(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
	
}
