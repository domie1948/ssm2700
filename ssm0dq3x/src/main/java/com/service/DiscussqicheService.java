package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqicheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqicheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqicheView;


/**
 * 汽车评论表
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface DiscussqicheService extends IService<DiscussqicheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqicheVO> selectListVO(Wrapper<DiscussqicheEntity> wrapper);
   	
   	DiscussqicheVO selectVO(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
   	
   	List<DiscussqicheView> selectListView(Wrapper<DiscussqicheEntity> wrapper);
   	
   	DiscussqicheView selectView(@Param("ew") Wrapper<DiscussqicheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqicheEntity> wrapper);
   	
}

