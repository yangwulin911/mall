package com.ywl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywl.common.utils.PageUtils;
import com.ywl.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 00:44:18
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

