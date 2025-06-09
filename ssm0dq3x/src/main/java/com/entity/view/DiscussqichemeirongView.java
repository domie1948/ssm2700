package com.entity.view;

import com.entity.DiscussqichemeirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车美容评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
@TableName("discussqichemeirong")
public class DiscussqichemeirongView  extends DiscussqichemeirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqichemeirongView(){
	}
 
 	public DiscussqichemeirongView(DiscussqichemeirongEntity discussqichemeirongEntity){
 	try {
			BeanUtils.copyProperties(this, discussqichemeirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
