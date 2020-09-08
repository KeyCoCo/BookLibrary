package com.keycoco.library.controller;

import com.keycoco.library.service.SysBookService;
import com.keycoco.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FeiBinHua
 * @date 2020/8/22
 */
@Controller
@RequestMapping("book")
public class BookAdministrationController {
    @Autowired
    SysBookService service;
    @RequestMapping(value = "doBookList")
    public String doBookList(){
        return "bookAdministration/bookList";
    }
    @RequestMapping(value = "queryBookList" ,method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result queryBookList(int page,int limit){
        return service.queryAllBook(page,limit);
    }

}
