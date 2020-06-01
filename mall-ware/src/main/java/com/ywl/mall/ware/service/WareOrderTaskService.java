package com.ywl.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywl.common.utils.PageUtils;
import com.ywl.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:13:51
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

