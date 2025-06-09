package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqichemeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqichemeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqichemeirongView;


/**
 * 汽车美容评论表
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface DiscussqichemeirongService extends IService<DiscussqichemeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqichemeirongVO> selectListVO(Wrapper<DiscussqichemeirongEntity> wrapper);
   	
   	DiscussqichemeirongVO selectVO(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
   	
   	List<DiscussqichemeirongView> selectListView(Wrapper<DiscussqichemeirongEntity> wrapper);
   	
   	DiscussqichemeirongView selectView(@Param("ew") Wrapper<DiscussqichemeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqichemeirongEntity> wrapper);
   	
}

