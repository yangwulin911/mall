package com.ywl.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywl.common.utils.PageUtils;
import com.ywl.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:13:51
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

