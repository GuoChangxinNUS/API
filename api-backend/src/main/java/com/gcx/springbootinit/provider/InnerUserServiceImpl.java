package com.gcx.springbootinit.provider;

import com.gcx.apicommon.entity.User;
import com.gcx.apicommon.service.InnerUserService;
import com.gcx.springbootinit.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public User getUserById(Long userId) {
        return userService.getById(userId);
    }
}
