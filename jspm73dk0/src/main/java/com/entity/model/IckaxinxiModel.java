package com.entity.model;

import com.entity.IckaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * ic卡信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public class IckaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户号
	 */
	
	private String yonghuhao;
		
	/**
	 * 车主类型
	 */
	
	private String chezhuleixing;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 车位编号
	 */
	
	private String cheweibianhao;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 停车价格
	 */
	
	private String tingchejiage;
				
	
	/**
	 * 设置：用户号
	 */
	 
	public void setYonghuhao(String yonghuhao) {
		this.yonghuhao = yonghuhao;
	}
	
	/**
	 * 获取：用户号
	 */
	public String getYonghuhao() {
		return yonghuhao;
	}
				
	
	/**
	 * 设置：车主类型
	 */
	 
	public void setChezhuleixing(String chezhuleixing) {
		this.chezhuleixing = chezhuleixing;
	}
	
	/**
	 * 获取：车主类型
	 */
	public String getChezhuleixing() {
		return chezhuleixing;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：车牌号码
	 */
	 
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	
	/**
	 * 获取：车牌号码
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
				
	
	/**
	 * 设置：车位编号
	 */
	 
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：停车价格
	 */
	 
	public void setTingchejiage(String tingchejiage) {
		this.tingchejiage = tingchejiage;
	}
	
	/**
	 * 获取：停车价格
	 */
	public String getTingchejiage() {
		return tingchejiage;
	}
			
}
