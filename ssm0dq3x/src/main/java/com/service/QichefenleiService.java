package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichefenleiView;


/**
 * 汽车分类
 *
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public interface QichefenleiService extends IService<QichefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichefenleiVO> selectListVO(Wrapper<QichefenleiEntity> wrapper);
   	
   	QichefenleiVO selectVO(@Param("ew") Wrapper<QichefenleiEntity> wrapper);
   	
   	List<QichefenleiView> selectListView(Wrapper<QichefenleiEntity> wrapper);
   	
   	QichefenleiView selectView(@Param("ew") Wrapper<QichefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichefenleiEntity> wrapper);
   	
}

