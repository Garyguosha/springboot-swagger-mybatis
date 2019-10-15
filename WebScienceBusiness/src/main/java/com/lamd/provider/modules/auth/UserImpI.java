package com.lamd.provider.modules.auth;

import com.lamd.api.exception.AppRuntimeException;
import com.lamd.api.io.modules.auth.UserIO;
import com.lamd.api.service.modules.auth.UserService;
import com.lamd.dao.mapper.auth.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

@Service
@EnableCaching
public class UserImpI implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int selUser(UserIO userIO) {
        try {
            return userMapper.selUser(userIO);
        }catch (Exception e){
            return -1;
        }
    }
}
