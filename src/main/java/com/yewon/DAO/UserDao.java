package com.yewon.DAO;

import com.yewon.DTO.UserDto;
import com.yewon.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public UserDto selectUser(final String userId) throws Exception{
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserDto userDto = mapper.selectUser(userId);

        return userDto;
    }

    @Transactional
    public void insertUser(UserDto dto) throws Exception{
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(dto);

    }
}
