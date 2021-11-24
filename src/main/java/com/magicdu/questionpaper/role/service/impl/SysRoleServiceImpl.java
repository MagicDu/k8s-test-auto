package com.magicdu.questionpaper.role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.magicdu.questionpaper.role.mapper.SysRoleMapper;
import com.magicdu.questionpaper.role.model.SysRole;
import com.magicdu.questionpaper.role.service.SysRoleService;
import com.magicdu.questionpaper.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService {

    @Override
    public Set<String> selectRolePermissionByUserId(Long userId) {
        List<SysRole> perms = baseMapper.selectRolePermissionByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (SysRole perm : perms)
        {
            if (StringUtils.isNotNull(perm))
            {
                permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
            }
        }
        return permsSet;
    }
}
