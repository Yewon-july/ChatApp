package com.yewon.service;

import com.yewon.DTO.UserDto;
import javax.servlet.http.HttpSession;

public interface UserService {

    public UserDto selectUser(UserDto dto) throws Exception;

    public void insertUser(UserDto dto) throws Exception;

}
