package com.dao;

import com.entity.IckaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.IckaxinxiVO;
import com.entity.view.IckaxinxiView;


/**
 * ic卡信息
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:04:41
 */
public interface IckaxinxiDao extends BaseMapper<IckaxinxiEntity> {
	
	List<IckaxinxiVO> selectListVO(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
	
	IckaxinxiVO selectVO(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
	
	List<IckaxinxiView> selectListView(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);

	List<IckaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
	
	IckaxinxiView selectView(@Param("ew") Wrapper<IckaxinxiEntity> wrapper);
	
}
