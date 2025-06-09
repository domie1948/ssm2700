package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheView;


/**
 * 汽车
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface QicheService extends IService<QicheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheVO> selectListVO(Wrapper<QicheEntity> wrapper);
   	
   	QicheVO selectVO(@Param("ew") Wrapper<QicheEntity> wrapper);
   	
   	List<QicheView> selectListView(Wrapper<QicheEntity> wrapper);
   	
   	QicheView selectView(@Param("ew") Wrapper<QicheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheEntity> wrapper);
   	
}

