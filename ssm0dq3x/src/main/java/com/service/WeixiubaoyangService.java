package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiubaoyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiubaoyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiubaoyangView;


/**
 * 维修保养
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface WeixiubaoyangService extends IService<WeixiubaoyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiubaoyangVO> selectListVO(Wrapper<WeixiubaoyangEntity> wrapper);
   	
   	WeixiubaoyangVO selectVO(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
   	
   	List<WeixiubaoyangView> selectListView(Wrapper<WeixiubaoyangEntity> wrapper);
   	
   	WeixiubaoyangView selectView(@Param("ew") Wrapper<WeixiubaoyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiubaoyangEntity> wrapper);
   	
}

