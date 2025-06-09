package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LinshichezhuchuchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LinshichezhuchuchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LinshichezhuchuchangView;


/**
 * 临时车主出场
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface LinshichezhuchuchangService extends IService<LinshichezhuchuchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LinshichezhuchuchangVO> selectListVO(Wrapper<LinshichezhuchuchangEntity> wrapper);
   	
   	LinshichezhuchuchangVO selectVO(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
   	
   	List<LinshichezhuchuchangView> selectListView(Wrapper<LinshichezhuchuchangEntity> wrapper);
   	
   	LinshichezhuchuchangView selectView(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LinshichezhuchuchangEntity> wrapper);
   	
}

