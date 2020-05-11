package com.yewon.mapper;

import com.yewon.DTO.UserDto;

public interface UserMapper {

    UserDto selectUser(String userId);

    void insertUser(UserDto dto);
}
