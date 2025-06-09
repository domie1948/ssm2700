package com.dao;

import com.entity.YuyuejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejiluVO;
import com.entity.view.YuyuejiluView;


/**
 * 预约记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface YuyuejiluDao extends BaseMapper<YuyuejiluEntity> {
	
	List<YuyuejiluVO> selectListVO(@Param("ew") Wrapper<YuyuejiluEntity> wrapper);
	
	YuyuejiluVO selectVO(@Param("ew") Wrapper<YuyuejiluEntity> wrapper);
	
	List<YuyuejiluView> selectListView(@Param("ew") Wrapper<YuyuejiluEntity> wrapper);

	List<YuyuejiluView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejiluEntity> wrapper);
	
	YuyuejiluView selectView(@Param("ew") Wrapper<YuyuejiluEntity> wrapper);
	
}
