package com.keycoco.library.pojo;


import java.io.Serializable;

/**
 * sys_book
 * @author 
 */
public class SysBook implements Serializable {
    /**
     * 书籍id
     */
    private Integer bookId;

    /**
     * 书籍类型id
     */
    private Integer bookTypeId;
    /**
     * 书籍类型名称
     */
    private String bookTypeName;

    /**
     * 书籍标题
     */
    private String bookTitle;

    /**
     * 书籍作者
     */
    private String bookAuthor;

    /**
     * 发布时间
     */
    private String bookDate;

    /**
     * 书籍内容
     */
    private String bookTxt;

    /**
     * 书籍封面
     */
    private String bookImg;

    private static final long serialVersionUID = 1L;

    public SysBook() {
    }

    public SysBook(Integer bookId, Integer bookTypeId, String bookTypeName, String bookTitle, String bookAuthor, String bookDate, String bookTxt, String bookImg) {
        this.bookId = bookId;
        this.bookTypeId = bookTypeId;
        this.bookTypeName = bookTypeName;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookDate = bookDate;
        this.bookTxt = bookTxt;
        this.bookImg = bookImg;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getBookTxt() {
        return bookTxt;
    }

    public void setBookTxt(String bookTxt) {
        this.bookTxt = bookTxt;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "SysBook{" +
                "bookId=" + bookId +
                ", bookTypeId=" + bookTypeId +
                ", bookTypeName='" + bookTypeName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookDate='" + bookDate + '\'' +
                ", bookTxt='" + bookTxt + '\'' +
                ", bookImg='" + bookImg + '\'' +
                '}';
    }
}