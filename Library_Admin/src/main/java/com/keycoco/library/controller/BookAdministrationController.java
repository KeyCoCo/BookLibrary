package com.keycoco.library.controller;

import com.keycoco.library.pojo.SysBook;
import com.keycoco.library.service.SysBookService;
import com.keycoco.util.Reflect;
import com.keycoco.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

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
    @RequestMapping(value = "delBookList" ,method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map delBookList(@RequestParam("arr") List<Integer> arrList){
        Result result=new Result();
        Map map=new HashMap();
        if(arrList.size()!=0){
            for (Integer bookId : arrList) {
                service.deleteByPrimaryKey(bookId);
            }
            map.put("code","200");
            map.put("msg","OK");
        }else{
            map.put("code","405");
            map.put("msg","NONULL");
        }
        return map;
    }
    @RequestMapping(value = "updateBook" ,method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map updateBook(@RequestParam("bookId")String bookId,@RequestParam("field")String fieldName,@RequestParam("value") String value) throws Exception {
        Map map=new HashMap();
        Reflect reflect=new Reflect();
        SysBook sysBook=new SysBook();
        sysBook.setBookId(Integer.parseInt(bookId));
        reflect.setValue(sysBook,sysBook.getClass(),fieldName,SysBook.class.getDeclaredField(fieldName).getType(),value);
        int i=service.updateByPrimaryKeySelective(sysBook);
        map.put("code",i);
        return map;
    }
    @RequestMapping("toAddBook")
    public String toAddBook(){
        return "bookAdministration/addbook";
    }


}
