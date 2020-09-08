package com.keycoco.library.service;

import com.keycoco.library.pojo.SysBook;
import com.keycoco.util.Result;

import java.util.List;

/**
 * @author FeiBinHua
 */
public interface SysBookService {
    /**
     * 查询所有书籍
     * @param page 从第几页开始显示
     * @param size 总页数
     * @return
     */
    Result queryAllBook(Integer page,Integer size);
    /**
     * 根据id删除书籍
     * @param bookId
     * @return
     */
    int deleteByPrimaryKey(Integer bookId);

    /**
     * 添加书籍
     * @param record
     * @return
     */
    int insert(SysBook record);

    /**
     * 添加书籍
     * @param record
     * @return
     */
    int insertSelective(SysBook record);

    /**
     * 根据id查找书籍
     * @param bookId
     * @return
     */
    SysBook selectByPrimaryKey(Integer bookId);

    /**
     * 修改书籍
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysBook record);

    /**
     * 修改书籍
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysBook record);
}
