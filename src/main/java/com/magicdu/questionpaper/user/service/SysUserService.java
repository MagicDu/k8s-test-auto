package com.magicdu.questionpaper.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.magicdu.questionpaper.user.model.SysUser;

public interface SysUserService  extends IService<SysUser> {
    SysUser selectUserByUserName(String username);
}
