package com.keycoco.library.dao.inter.book;

import com.keycoco.library.pojo.SysBook;

import java.util.List;

/**
 * @author FeiBinHua
 * @date 2020/8/20
 */
public interface SysBookDao {
    /**
     * 查询所有书籍
     * @return
     */
    List<SysBook> queryAllBook();
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