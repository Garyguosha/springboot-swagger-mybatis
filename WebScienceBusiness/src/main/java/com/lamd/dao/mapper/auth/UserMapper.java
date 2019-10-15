package com.lamd.dao.mapper.auth;

import com.lamd.api.io.modules.auth.UserIO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    int selUser(UserIO userIO);
}
