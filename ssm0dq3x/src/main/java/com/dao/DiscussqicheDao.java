package com.dao;

import com.entity.DiscussqicheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqicheVO;
import com.entity.view.DiscussqicheView;


/**
 * 汽车评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface DiscussqicheDao extends BaseMapper<DiscussqicheEntity> {
	
	List<DiscussqicheVO> selectListVO(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
	
	DiscussqicheVO selectVO(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
	
	List<DiscussqicheView> selectListView(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);

	List<DiscussqicheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
	
	DiscussqicheView selectView(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
	
}
