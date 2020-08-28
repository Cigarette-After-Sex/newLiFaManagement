package cn.edu.guet.mapper;


import cn.edu.guet.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    Menu getMenuById(String id);
    List<Menu> getAllMenu();
    List<Menu> getUserMenu(String userId);
    void insertMenu(Menu menu) throws Exception;
    void updateMenu(Menu menu);
    void deleteMenu(String id);
    void deleteChildRecord(String id);
}