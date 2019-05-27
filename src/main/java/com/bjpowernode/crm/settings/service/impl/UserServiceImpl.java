package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.dao.StudentDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {
    private StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);

    public User selectOne(String s) {

        return studentDao.selectOne(s);
    }
}
