package com.dao;

import com.entity.LinshichezhutingcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LinshichezhutingcheVO;
import com.entity.view.LinshichezhutingcheView;


/**
 * 临时车主停车
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface LinshichezhutingcheDao extends BaseMapper<LinshichezhutingcheEntity> {
	
	List<LinshichezhutingcheVO> selectListVO(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
	
	LinshichezhutingcheVO selectVO(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
	
	List<LinshichezhutingcheView> selectListView(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);

	List<LinshichezhutingcheView> selectListView(Pagination page,@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
	
	LinshichezhutingcheView selectView(@Param("ew") Wrapper<LinshichezhutingcheEntity> wrapper);
	
}
