package com.entity.view;

import com.entity.GudingchezhutingcheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 固定车主停车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
@TableName("gudingchezhutingche")
public class GudingchezhutingcheView  extends GudingchezhutingcheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GudingchezhutingcheView(){
	}
 
 	public GudingchezhutingcheView(GudingchezhutingcheEntity gudingchezhutingcheEntity){
 	try {
			BeanUtils.copyProperties(this, gudingchezhutingcheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
