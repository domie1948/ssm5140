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


import com.dao.LinshichezhutingcheDao;
import com.entity.LinshichezhutingcheEntity;
import com.service.LinshichezhutingcheService;
import com.entity.vo.LinshichezhutingcheVO;
import com.entity.view.LinshichezhutingcheView;

@Service("linshichezhutingcheService")
public class LinshichezhutingcheServiceImpl extends ServiceImpl<LinshichezhutingcheDao, LinshichezhutingcheEntity> implements LinshichezhutingcheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LinshichezhutingcheEntity> page = this.selectPage(
                new Query<LinshichezhutingcheEntity>(params).getPage(),
                new EntityWrapper<LinshichezhutingcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LinshichezhutingcheEntity> wrapper) {
		  Page<LinshichezhutingcheView> page =new Query<LinshichezhutingcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LinshichezhutingcheVO> selectListVO(Wrapper<LinshichezhutingcheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LinshichezhutingcheVO selectVO(Wrapper<LinshichezhutingcheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LinshichezhutingcheView> selectListView(Wrapper<LinshichezhutingcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LinshichezhutingcheView selectView(Wrapper<LinshichezhutingcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
