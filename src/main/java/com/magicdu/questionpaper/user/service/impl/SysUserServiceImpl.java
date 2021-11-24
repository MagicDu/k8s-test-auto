package com.magicdu.questionpaper.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.magicdu.questionpaper.user.mapper.SysUserMapper;
import com.magicdu.questionpaper.user.model.SysUser;
import com.magicdu.questionpaper.user.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

    @Override
    public SysUser selectUserByUserName(String username) {
        return baseMapper.selectUserByUserName(username);
    }
}
