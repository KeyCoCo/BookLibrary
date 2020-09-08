import com.keycoco.library.controller.BookAdministrationController;
import com.keycoco.library.controller.LoginController;
import com.keycoco.library.dao.inter.book.SysBookDao;
import com.keycoco.library.service.LoginService;
import com.keycoco.library.service.MenuService;
import com.keycoco.library.service.SysBookService;
import com.keycoco.library.service.SysBookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author FeiBinHua
 * @date 2020/8/21
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class test {
    @Autowired
    LoginService service;
    @Autowired
    LoginController controller;
    @Test
    public void print1(){
        System.out.println(service.queryUser("root"));
    }

//    public void print2(){
//        System.out.println(controller.doLogin("root","admin"));
//    }
    @Autowired
    MenuService menuService;
    @Test
    public void print3(){
        System.out.println(menuService.queryMenus(1));
    }
    @Autowired
    BookAdministrationController administrationController;
//    @Test
//    public void print4(){
//        System.out.println(administrationController.getBookList().toJSONString());
//    }
//    @Autowired
//    SysBookService  sysBookService;
//    @Test
//    public void print5(){
//        System.out.println(sysBookService.queryAllBook().toString());
//    }
    @Autowired
SysBookServiceImpl sysBookService;
    @Test
    public void print6(){
        System.out.println(sysBookService.queryBook(1,10));
    }



}
