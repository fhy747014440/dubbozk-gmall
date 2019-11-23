package com.city.oa.gmall.ums.service.impl;

import com.city.oa.gmall.ums.entity.Admin;
import com.city.oa.gmall.ums.mapper.AdminMapper;
import com.city.oa.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-22
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public Admin login(String username, String password) {
        return null;
    }
}
