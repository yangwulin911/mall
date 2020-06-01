package com.ywl.mall.coupon.dao;

import com.ywl.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:24:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
