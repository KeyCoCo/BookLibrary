package com.keycoco.library.dao.inter.menu;

import com.keycoco.library.pojo.SysMenu;

import java.util.List;

/**
 * @author FeiBinHua
 * @date 2020/8/22
 */
public interface MenuDao {
    /**
     * 查询所有菜单
     * @return
     */
    List<SysMenu> queryMenus(Integer level);
}
