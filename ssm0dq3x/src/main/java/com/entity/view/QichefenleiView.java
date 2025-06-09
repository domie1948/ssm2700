package com.entity.view;

import com.entity.QichefenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
@TableName("qichefenlei")
public class QichefenleiView  extends QichefenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichefenleiView(){
	}
 
 	public QichefenleiView(QichefenleiEntity qichefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, qichefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
