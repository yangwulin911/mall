package com.ywl.mall.order.dao;

import com.ywl.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:10:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
