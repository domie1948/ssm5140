package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.IckaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.IckaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.IckaxinxiView;


/**
 * ic卡信息
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface IckaxinxiService extends IService<IckaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<IckaxinxiVO> selectListVO(Wrapper<IckaxinxiEntity> wrapper);
   	
   	IckaxinxiVO selectVO(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
   	
   	List<IckaxinxiView> selectListView(Wrapper<IckaxinxiEntity> wrapper);
   	
   	IckaxinxiView selectView(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<IckaxinxiEntity> wrapper);
   	
}

