package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.mapper.CartMapper;
import com.jt.pojo.Cart;

@Service(timeout=3000)
public class DubboCartServiceImpl implements DubbCartService { 

	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> findCartListById(Long userId) {
		 QueryWrapper<Cart> queryWrapper = new QueryWrapper<Cart>();
		 queryWrapper.eq("user_id", userId);
		 List<Cart> selectList = cartMapper.selectList(queryWrapper);
		return  selectList ;
	}

	@Override
	public void updateCartNum(Cart cart) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
