package com.ywl.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywl.common.utils.PageUtils;
import com.ywl.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:16:04
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

