package com.entity.vo;

import com.entity.LinshichezhuchuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 临时车主出场
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public class LinshichezhuchuchangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位编号
	 */
	
	private String cheweibianhao;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 用户号
	 */
	
	private String yonghuhao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 车主类型
	 */
	
	private String chezhuleixing;
		
	/**
	 * ic卡号
	 */
	
	private String ickahao;
		
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
	 * 停车时长
	 */
	
	private Integer tingcheshizhang;
		
	/**
	 * 停车价格
	 */
	
	private Integer tingchejiage;
		
	/**
	 * 停车费用
	 */
	
	private Integer tingchefeiyong;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
				
	
	/**
	 * 设置：停车时长
	 */
	 
	public void setTingcheshizhang(Integer tingcheshizhang) {
		this.tingcheshizhang = tingcheshizhang;
	}
	
	/**
	 * 获取：停车时长
	 */
	public Integer getTingcheshizhang() {
		return tingcheshizhang;
	}
				
	
	/**
	 * 设置：停车价格
	 */
	 
	public void setTingchejiage(Integer tingchejiage) {
		this.tingchejiage = tingchejiage;
	}
	
	/**
	 * 获取：停车价格
	 */
	public Integer getTingchejiage() {
		return tingchejiage;
	}
				
	
	/**
	 * 设置：停车费用
	 */
	 
	public void setTingchefeiyong(Integer tingchefeiyong) {
		this.tingchefeiyong = tingchefeiyong;
	}
	
	/**
	 * 获取：停车费用
	 */
	public Integer getTingchefeiyong() {
		return tingchefeiyong;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
