package com.iotek.dao;

import com.iotek.pojo.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersMapper {
    public List<Users> login(Users users);
    public int register(Users users);
}
