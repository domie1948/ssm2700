package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhoufuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhoufuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhoufuwuView;


/**
 * 售后服务
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface ShouhoufuwuService extends IService<ShouhoufuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhoufuwuVO> selectListVO(Wrapper<ShouhoufuwuEntity> wrapper);
   	
   	ShouhoufuwuVO selectVO(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
   	
   	List<ShouhoufuwuView> selectListView(Wrapper<ShouhoufuwuEntity> wrapper);
   	
   	ShouhoufuwuView selectView(@Param("ew") Wrapper<ShouhoufuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhoufuwuEntity> wrapper);
   	
}

