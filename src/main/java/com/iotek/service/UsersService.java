package com.iotek.service;

import com.iotek.dao.UsersMapper;
import com.iotek.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public boolean login(Users users){
        List<Users> login = usersMapper.login(users);
        if (login!=null){
            return true;
        }else {
            return false;
        }
    }

    public boolean register(Users users){
        int register = usersMapper.register(users);
        if (register!=0){
            return true;
        }else {
            return false;
        }
    }
}
