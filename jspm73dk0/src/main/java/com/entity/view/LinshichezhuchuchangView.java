package com.entity.view;

import com.entity.LinshichezhuchuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 临时车主出场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
@TableName("linshichezhuchuchang")
public class LinshichezhuchuchangView  extends LinshichezhuchuchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LinshichezhuchuchangView(){
	}
 
 	public LinshichezhuchuchangView(LinshichezhuchuchangEntity linshichezhuchuchangEntity){
 	try {
			BeanUtils.copyProperties(this, linshichezhuchuchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
