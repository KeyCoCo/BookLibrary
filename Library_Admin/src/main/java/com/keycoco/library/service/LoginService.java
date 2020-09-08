package com.keycoco.library.service;

import com.keycoco.library.pojo.SysUser;

/**
 * @author FeiBinHua
 * @date 2020/8/20
 */
public interface LoginService {
    /**
     * 查询用户对象
     * @param name
     * @return
     */
    SysUser queryUser(String name);

}
