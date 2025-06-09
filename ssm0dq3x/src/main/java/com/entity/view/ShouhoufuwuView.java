package com.entity.view;

import com.entity.ShouhoufuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 售后服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
@TableName("shouhoufuwu")
public class ShouhoufuwuView  extends ShouhoufuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhoufuwuView(){
	}
 
 	public ShouhoufuwuView(ShouhoufuwuEntity shouhoufuwuEntity){
 	try {
			BeanUtils.copyProperties(this, shouhoufuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
