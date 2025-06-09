package com.dao;

import com.entity.DiscussqichemeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqichemeirongVO;
import com.entity.view.DiscussqichemeirongView;


/**
 * 汽车美容评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface DiscussqichemeirongDao extends BaseMapper<DiscussqichemeirongEntity> {
	
	List<DiscussqichemeirongVO> selectListVO(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
	
	DiscussqichemeirongVO selectVO(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
	
	List<DiscussqichemeirongView> selectListView(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);

	List<DiscussqichemeirongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
	
	DiscussqichemeirongView selectView(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
	
}
