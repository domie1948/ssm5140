package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GudingchezhutingcheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GudingchezhutingcheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GudingchezhutingcheView;


/**
 * 固定车主停车
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface GudingchezhutingcheService extends IService<GudingchezhutingcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GudingchezhutingcheVO> selectListVO(Wrapper<GudingchezhutingcheEntity> wrapper);
   	
   	GudingchezhutingcheVO selectVO(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
   	
   	List<GudingchezhutingcheView> selectListView(Wrapper<GudingchezhutingcheEntity> wrapper);
   	
   	GudingchezhutingcheView selectView(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GudingchezhutingcheEntity> wrapper);
   	
}

