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


import com.dao.GudingchezhutingcheDao;
import com.entity.GudingchezhutingcheEntity;
import com.service.GudingchezhutingcheService;
import com.entity.vo.GudingchezhutingcheVO;
import com.entity.view.GudingchezhutingcheView;

@Service("gudingchezhutingcheService")
public class GudingchezhutingcheServiceImpl extends ServiceImpl<GudingchezhutingcheDao, GudingchezhutingcheEntity> implements GudingchezhutingcheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GudingchezhutingcheEntity> page = this.selectPage(
                new Query<GudingchezhutingcheEntity>(params).getPage(),
                new EntityWrapper<GudingchezhutingcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GudingchezhutingcheEntity> wrapper) {
		  Page<GudingchezhutingcheView> page =new Query<GudingchezhutingcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GudingchezhutingcheVO> selectListVO(Wrapper<GudingchezhutingcheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GudingchezhutingcheVO selectVO(Wrapper<GudingchezhutingcheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GudingchezhutingcheView> selectListView(Wrapper<GudingchezhutingcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GudingchezhutingcheView selectView(Wrapper<GudingchezhutingcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
