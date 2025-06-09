package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GudingchezhuchuchangDao;
import com.entity.GudingchezhuchuchangEntity;
import com.service.GudingchezhuchuchangService;
import com.entity.vo.GudingchezhuchuchangVO;
import com.entity.view.GudingchezhuchuchangView;

@Service("gudingchezhuchuchangService")
public class GudingchezhuchuchangServiceImpl extends ServiceImpl<GudingchezhuchuchangDao, GudingchezhuchuchangEntity> implements GudingchezhuchuchangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GudingchezhuchuchangEntity> page = this.selectPage(
                new Query<GudingchezhuchuchangEntity>(params).getPage(),
                new EntityWrapper<GudingchezhuchuchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GudingchezhuchuchangEntity> wrapper) {
		  Page<GudingchezhuchuchangView> page =new Query<GudingchezhuchuchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GudingchezhuchuchangVO> selectListVO(Wrapper<GudingchezhuchuchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GudingchezhuchuchangVO selectVO(Wrapper<GudingchezhuchuchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GudingchezhuchuchangView> selectListView(Wrapper<GudingchezhuchuchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GudingchezhuchuchangView selectView(Wrapper<GudingchezhuchuchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
