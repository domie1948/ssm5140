package com.entity.vo;

import com.entity.GudingchezhuchuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 固定车主出场
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public class GudingchezhuchuchangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * ic卡号
	 */
	
	private String ickahao;
		
	/**
	 * 车主类型
	 */
	
	private String chezhuleixing;
		
	/**
	 * 车位编号
	 */
	
	private String cheweibianhao;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 入场时间
	 */
	
	private String ruchangshijian;
		
	/**
	 * 出场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuchangshijian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：ic卡号
	 */
	 
	public void setIckahao(String ickahao) {
		this.ickahao = ickahao;
	}
	
	/**
	 * 获取：ic卡号
	 */
	public String getIckahao() {
		return ickahao;
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
	 * 设置：入场时间
	 */
	 
	public void setRuchangshijian(String ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	
	/**
	 * 获取：入场时间
	 */
	public String getRuchangshijian() {
		return ruchangshijian;
	}
				
	
	/**
	 * 设置：出场时间
	 */
	 
	public void setChuchangshijian(Date chuchangshijian) {
		this.chuchangshijian = chuchangshijian;
	}
	
	/**
	 * 获取：出场时间
	 */
	public Date getChuchangshijian() {
		return chuchangshijian;
	}
			
}
