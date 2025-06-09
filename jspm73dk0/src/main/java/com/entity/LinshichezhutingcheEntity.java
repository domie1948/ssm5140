package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 临时车主停车
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
@TableName("linshichezhutingche")
public class LinshichezhutingcheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LinshichezhutingcheEntity() {
		
	}
	
	public LinshichezhutingcheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
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
	 * 入场时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruchangshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	/**
	 * 设置：入场时间
	 */
	public void setRuchangshijian(Date ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	/**
	 * 获取：入场时间
	 */
	public Date getRuchangshijian() {
		return ruchangshijian;
	}

}
