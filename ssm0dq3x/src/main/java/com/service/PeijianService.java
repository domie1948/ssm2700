package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijianView;


/**
 * 配件
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface PeijianService extends IService<PeijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijianVO> selectListVO(Wrapper<PeijianEntity> wrapper);
   	
   	PeijianVO selectVO(@Param("ew") Wrapper<PeijianEntity> wrapper);
   	
   	List<PeijianView> selectListView(Wrapper<PeijianEntity> wrapper);
   	
   	PeijianView selectView(@Param("ew") Wrapper<PeijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijianEntity> wrapper);
   	
}

