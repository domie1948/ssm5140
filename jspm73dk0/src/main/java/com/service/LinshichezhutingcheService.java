package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LinshichezhutingcheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LinshichezhutingcheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LinshichezhutingcheView;


/**
 * 临时车主停车
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface LinshichezhutingcheService extends IService<LinshichezhutingcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LinshichezhutingcheVO> selectListVO(Wrapper<LinshichezhutingcheEntity> wrapper);
   	
   	LinshichezhutingcheVO selectVO(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
   	
   	List<LinshichezhutingcheView> selectListView(Wrapper<LinshichezhutingcheEntity> wrapper);
   	
   	LinshichezhutingcheView selectView(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LinshichezhutingcheEntity> wrapper);
   	
}

