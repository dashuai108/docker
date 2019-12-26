package com.dashuai.pg.mavenpg.service;

import com.dashuai.pg.mavenpg.entity.User;
import com.dashuai.pg.mavenpg.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MavenService {

    @Autowired
    private UserDao userDao;

    public List<User> getUser(){
        return userDao.findAll();
    }
}
