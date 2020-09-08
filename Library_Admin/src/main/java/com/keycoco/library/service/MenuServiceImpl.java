package com.keycoco.library.service;

import com.keycoco.library.dao.inter.menu.MenuDao;
import com.keycoco.library.pojo.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FeiBinHua
 * @date 2020/8/22
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao dao;

    @Override
    public List<SysMenu> queryMenus(Integer level) {
        return dao.queryMenus(level);
    }
}
