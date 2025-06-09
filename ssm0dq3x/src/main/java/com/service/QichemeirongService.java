package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichemeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichemeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichemeirongView;


/**
 * 汽车美容
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface QichemeirongService extends IService<QichemeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichemeirongVO> selectListVO(Wrapper<QichemeirongEntity> wrapper);
   	
   	QichemeirongVO selectVO(@Param("ew") Wrapper<QichemeirongEntity> wrapper);
   	
   	List<QichemeirongView> selectListView(Wrapper<QichemeirongEntity> wrapper);
   	
   	QichemeirongView selectView(@Param("ew") Wrapper<QichemeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichemeirongEntity> wrapper);
   	
}

