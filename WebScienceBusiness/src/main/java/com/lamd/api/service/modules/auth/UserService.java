package com.lamd.api.service.modules.auth;

import com.lamd.api.io.modules.auth.UserIO;
import org.mapstruct.Mapper;

public interface UserService {

    int selUser(UserIO userIO);

}
