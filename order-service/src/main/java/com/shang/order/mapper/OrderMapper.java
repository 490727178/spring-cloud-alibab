package com.shang.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shang.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    //1 新建订单
    void createOrder(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
