package com.magicdu.questionpaper.menu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.magicdu.questionpaper.menu.mapper.SysMenuMapper;
import com.magicdu.questionpaper.menu.model.SysMenu;
import com.magicdu.questionpaper.menu.service.SysMenuService;
import com.magicdu.questionpaper.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper,SysMenu> implements SysMenuService {

    @Override
    public Set<String> selectMenuPermsByUserId(Long userId) {
        List<String> perms = baseMapper.selectMenuPermsByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (String perm : perms)
        {
            if (StringUtils.isNotEmpty(perm))
            {
                permsSet.addAll(Arrays.asList(perm.trim().split(",")));
            }
        }
        return permsSet;
    }
}
