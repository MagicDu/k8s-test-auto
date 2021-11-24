package com.magicdu.questionpaper.role.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.magicdu.questionpaper.role.model.SysRole;

import java.util.Set;

public interface SysRoleService extends IService<SysRole> {
    Set<String> selectRolePermissionByUserId(Long userId);
}
