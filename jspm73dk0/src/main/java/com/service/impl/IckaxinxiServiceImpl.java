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


import com.dao.IckaxinxiDao;
import com.entity.IckaxinxiEntity;
import com.service.IckaxinxiService;
import com.entity.vo.IckaxinxiVO;
import com.entity.view.IckaxinxiView;

@Service("ickaxinxiService")
public class IckaxinxiServiceImpl extends ServiceImpl<IckaxinxiDao, IckaxinxiEntity> implements IckaxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IckaxinxiEntity> page = this.selectPage(
                new Query<IckaxinxiEntity>(params).getPage(),
                new EntityWrapper<IckaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<IckaxinxiEntity> wrapper) {
		  Page<IckaxinxiView> page =new Query<IckaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<IckaxinxiVO> selectListVO(Wrapper<IckaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public IckaxinxiVO selectVO(Wrapper<IckaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<IckaxinxiView> selectListView(Wrapper<IckaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public IckaxinxiView selectView(Wrapper<IckaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
