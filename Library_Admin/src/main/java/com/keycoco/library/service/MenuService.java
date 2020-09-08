package com.keycoco.library.service;

import com.keycoco.library.pojo.SysMenu;

import java.util.List;

/**
 * @author FeiBinHua
 */
public interface MenuService {
    /**
     * 查询所有菜单
     * @return
     */
    List<SysMenu> queryMenus(Integer level);
}
