package com.keycoco.library.dao.inter;

import com.keycoco.library.pojo.SysUser;

/**
 * @author FeiBinHua
 * @date 2020/8/20
 */
public interface LoginDao {
    /**
     * 登录
     * @param name 根据用户名查询返回对象
     * @return
     */
    SysUser queryUser(String name);
}
