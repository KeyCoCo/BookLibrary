package com.keycoco.library.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.keycoco.library.dao.inter.book.SysBookDao;
import com.keycoco.library.pojo.SysBook;
import com.keycoco.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FeiBinHua
 * @date 2020/8/22
 */
@Service
public class SysBookServiceImpl implements SysBookService {
    @Autowired
    SysBookDao dao;
    @Override
    public Result queryAllBook(Integer page,Integer size) {
        PageHelper.startPage(page,size,true);
        List<SysBook> bookList = dao.queryAllBook();
        PageInfo<SysBook> pageInfo = new PageInfo<>(bookList);
        Result rs = new Result();
        rs.setCode("0");
        rs.setCount(pageInfo.getTotal());
        rs.setMsg("OK");
        rs.setData(pageInfo.getList());
        return rs;
    }
    public PageInfo<SysBook> queryBook(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        List<SysBook> bookList = dao.queryAllBook();
        PageInfo<SysBook> pageInfo = new PageInfo<>(bookList);

        return pageInfo;
    }


    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return dao.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(SysBook record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(SysBook record) {
        return dao.insertSelective(record);
    }

    @Override
    public SysBook selectByPrimaryKey(Integer bookId) {
        return dao.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysBook record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysBook record) {
        return dao.updateByPrimaryKey(record);
    }
}
