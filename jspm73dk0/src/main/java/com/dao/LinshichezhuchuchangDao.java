package com.dao;

import com.entity.LinshichezhuchuchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LinshichezhuchuchangVO;
import com.entity.view.LinshichezhuchuchangView;


/**
 * 临时车主出场
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface LinshichezhuchuchangDao extends BaseMapper<LinshichezhuchuchangEntity> {
	
	List<LinshichezhuchuchangVO> selectListVO(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
	
	LinshichezhuchuchangVO selectVO(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
	
	List<LinshichezhuchuchangView> selectListView(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);

	List<LinshichezhuchuchangView> selectListView(Pagination page,@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
	
	LinshichezhuchuchangView selectView(@Param("ew") Wrapper<LinshichezhuchuchangEntity> wrapper);
	
}
