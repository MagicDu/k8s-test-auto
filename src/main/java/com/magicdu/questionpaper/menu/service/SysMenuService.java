package com.magicdu.questionpaper.menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.magicdu.questionpaper.menu.model.SysMenu;

import java.util.Set;

public interface SysMenuService extends IService<SysMenu> {
    Set<String> selectMenuPermsByUserId(Long userId);
}
