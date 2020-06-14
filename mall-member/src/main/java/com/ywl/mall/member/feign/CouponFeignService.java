package com.ywl.mall.member.feign;

import com.ywl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    /**
     * 查询优惠券列表
     * @return 优惠券列表
     */
    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();

}
