package com.city.oa.gmall.ums.service.impl;

import com.city.oa.gmall.ums.entity.AdminPermissionRelation;
import com.city.oa.gmall.ums.mapper.AdminPermissionRelationMapper;
import com.city.oa.gmall.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-22
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}