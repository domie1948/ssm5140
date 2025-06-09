package com.dao;

import com.entity.GudingchezhutingcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GudingchezhutingcheVO;
import com.entity.view.GudingchezhutingcheView;


/**
 * 固定车主停车
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface GudingchezhutingcheDao extends BaseMapper<GudingchezhutingcheEntity> {
	
	List<GudingchezhutingcheVO> selectListVO(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
	
	GudingchezhutingcheVO selectVO(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
	
	List<GudingchezhutingcheView> selectListView(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);

	List<GudingchezhutingcheView> selectListView(Pagination page,@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
	
	GudingchezhutingcheView selectView(@Param("ew") Wrapper<GudingchezhutingcheEntity> wrapper);
	
}
