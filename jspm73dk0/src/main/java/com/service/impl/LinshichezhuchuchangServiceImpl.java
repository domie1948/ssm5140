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


import com.dao.LinshichezhuchuchangDao;
import com.entity.LinshichezhuchuchangEntity;
import com.service.LinshichezhuchuchangService;
import com.entity.vo.LinshichezhuchuchangVO;
import com.entity.view.LinshichezhuchuchangView;

@Service("linshichezhuchuchangService")
public class LinshichezhuchuchangServiceImpl extends ServiceImpl<LinshichezhuchuchangDao, LinshichezhuchuchangEntity> implements LinshichezhuchuchangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LinshichezhuchuchangEntity> page = this.selectPage(
                new Query<LinshichezhuchuchangEntity>(params).getPage(),
                new EntityWrapper<LinshichezhuchuchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LinshichezhuchuchangEntity> wrapper) {
		  Page<LinshichezhuchuchangView> page =new Query<LinshichezhuchuchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LinshichezhuchuchangVO> selectListVO(Wrapper<LinshichezhuchuchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LinshichezhuchuchangVO selectVO(Wrapper<LinshichezhuchuchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LinshichezhuchuchangView> selectListView(Wrapper<LinshichezhuchuchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LinshichezhuchuchangView selectView(Wrapper<LinshichezhuchuchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
