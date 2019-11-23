package com.city.oa.gmall.oms.service.impl;

import com.city.oa.gmall.oms.entity.OrderItem;
import com.city.oa.gmall.oms.mapper.OrderItemMapper;
import com.city.oa.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-22
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
