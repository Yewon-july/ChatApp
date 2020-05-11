package com.yewon.service;

import com.yewon.DAO.UserDao;
import com.yewon.DTO.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto selectUser(UserDto dto) throws Exception{
        UserDto userDto = userDao.selectUser(dto.getUserId());
        System.out.println(userDto.getUserId());
        return userDto;
    }

    @Override
    public void insertUser(UserDto dto) throws Exception{
        userDao.insertUser(dto);
    }
}
