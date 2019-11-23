package com.city.oa.gmall.oms.service.impl;

import com.city.oa.gmall.oms.entity.Order;
import com.city.oa.gmall.oms.mapper.OrderMapper;
import com.city.oa.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-22
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
