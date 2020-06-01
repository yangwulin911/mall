package com.ywl.mall.product.dao;

import com.ywl.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 00:44:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
