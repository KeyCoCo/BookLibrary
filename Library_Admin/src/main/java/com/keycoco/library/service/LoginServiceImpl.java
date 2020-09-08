package com.keycoco.library.service;

import com.keycoco.library.dao.inter.LoginDao;
import com.keycoco.library.pojo.SysUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FeiBinHua
 * @date 2020/8/20
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao dao;

    @Override
    public SysUser queryUser(String name) {
        return dao.queryUser(name);
    }
}
