package com.dao;

import com.entity.GudingchezhuchuchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GudingchezhuchuchangVO;
import com.entity.view.GudingchezhuchuchangView;


/**
 * 固定车主出场
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface GudingchezhuchuchangDao extends BaseMapper<GudingchezhuchuchangEntity> {
	
	List<GudingchezhuchuchangVO> selectListVO(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
	
	GudingchezhuchuchangVO selectVO(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
	
	List<GudingchezhuchuchangView> selectListView(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);

	List<GudingchezhuchuchangView> selectListView(Pagination page,@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
	
	GudingchezhuchuchangView selectView(@Param("ew") Wrapper<GudingchezhuchuchangEntity> wrapper);
	
}
