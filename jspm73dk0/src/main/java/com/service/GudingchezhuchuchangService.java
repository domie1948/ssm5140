package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GudingchezhuchuchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GudingchezhuchuchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GudingchezhuchuchangView;


/**
 * 固定车主出场
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface GudingchezhuchuchangService extends IService<GudingchezhuchuchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GudingchezhuchuchangVO> selectListVO(Wrapper<GudingchezhuchuchangEntity> wrapper);
   	
   	GudingchezhuchuchangVO selectVO(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
   	
   	List<GudingchezhuchuchangView> selectListView(Wrapper<GudingchezhuchuchangEntity> wrapper);
   	
   	GudingchezhuchuchangView selectView(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GudingchezhuchuchangEntity> wrapper);
   	
}

