package com.ywl.mall.member.dao;

import com.ywl.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangwulin
 * @email yangwulin911@163.com
 * @date 2020-06-01 21:16:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
