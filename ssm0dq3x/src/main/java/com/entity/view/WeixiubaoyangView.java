package com.entity.view;

import com.entity.WeixiubaoyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修保养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
@TableName("weixiubaoyang")
public class WeixiubaoyangView  extends WeixiubaoyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiubaoyangView(){
	}
 
 	public WeixiubaoyangView(WeixiubaoyangEntity weixiubaoyangEntity){
 	try {
			BeanUtils.copyProperties(this, weixiubaoyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
