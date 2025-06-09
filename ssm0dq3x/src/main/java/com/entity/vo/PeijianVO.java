package com.entity.vo;

import com.entity.PeijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 配件
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public class PeijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配件名称
	 */
	
	private String peijianmingcheng;
		
	/**
	 * 配件分类
	 */
	
	private String peijianfenlei;
		
	/**
	 * 排量
	 */
	
	private String pailiang;
		
	/**
	 * 供销商名称
	 */
	
	private String gongxiaoshangmingcheng;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 配件图片
	 */
	
	private String peijiantupian;
		
	/**
	 * 配件价格
	 */
	
	private Integer peijianjiage;
		
	/**
	 * 配件介绍
	 */
	
	private String peijianjieshao;
				
	
	/**
	 * 设置：配件名称
	 */
	 
	public void setPeijianmingcheng(String peijianmingcheng) {
		this.peijianmingcheng = peijianmingcheng;
	}
	
	/**
	 * 获取：配件名称
	 */
	public String getPeijianmingcheng() {
		return peijianmingcheng;
	}
				
	
	/**
	 * 设置：配件分类
	 */
	 
	public void setPeijianfenlei(String peijianfenlei) {
		this.peijianfenlei = peijianfenlei;
	}
	
	/**
	 * 获取：配件分类
	 */
	public String getPeijianfenlei() {
		return peijianfenlei;
	}
				
	
	/**
	 * 设置：排量
	 */
	 
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	
	/**
	 * 获取：排量
	 */
	public String getPailiang() {
		return pailiang;
	}
				
	
	/**
	 * 设置：供销商名称
	 */
	 
	public void setGongxiaoshangmingcheng(String gongxiaoshangmingcheng) {
		this.gongxiaoshangmingcheng = gongxiaoshangmingcheng;
	}
	
	/**
	 * 获取：供销商名称
	 */
	public String getGongxiaoshangmingcheng() {
		return gongxiaoshangmingcheng;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：配件图片
	 */
	 
	public void setPeijiantupian(String peijiantupian) {
		this.peijiantupian = peijiantupian;
	}
	
	/**
	 * 获取：配件图片
	 */
	public String getPeijiantupian() {
		return peijiantupian;
	}
				
	
	/**
	 * 设置：配件价格
	 */
	 
	public void setPeijianjiage(Integer peijianjiage) {
		this.peijianjiage = peijianjiage;
	}
	
	/**
	 * 获取：配件价格
	 */
	public Integer getPeijianjiage() {
		return peijianjiage;
	}
				
	
	/**
	 * 设置：配件介绍
	 */
	 
	public void setPeijianjieshao(String peijianjieshao) {
		this.peijianjieshao = peijianjieshao;
	}
	
	/**
	 * 获取：配件介绍
	 */
	public String getPeijianjieshao() {
		return peijianjieshao;
	}
			
}
