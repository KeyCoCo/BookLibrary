package com.keycoco.library.controller;

import com.keycoco.library.pojo.SysMenu;
import com.keycoco.library.pojo.SysUser;
import com.keycoco.library.service.LoginService;
import com.keycoco.library.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author FeiBinHua
 * @date 2020/8/20
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private MenuService menuService;
    @RequestMapping("doLogin/{username}/{password}")
    public String doLogin(@PathVariable("username")@ModelAttribute String username,
                          @PathVariable("password")@ModelAttribute String password,
                          ModelMap map){
        SysUser user=loginService.queryUser(username);
        if(user==null){
            return "../../index";
        }
        if(user.getUserName().equals(username)){
            if(user.getUserPass().equals(password)){
                if(user.getState()==0){
                    List<SysMenu> sysMenuList1=menuService.queryMenus(1);
                    map.addAttribute("menuList1",sysMenuList1);
                    return "main";
                }
            }
        }
        return "../../index";
    }
    @RequestMapping("welcome")
    public String welcome(){
        return "common/welcome";
    }
    @RequestMapping("exit")
    public String exit(){
        return "../../index";
    }
}
