package cn.edu.guet.service;

import cn.edu.guet.model.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getAllMenu();
    List<Menu> getUserMenu(String userId);
    void insertMenu(Menu menu) throws Exception;
    void updateMenu(Menu menu) throws Exception;
    void deleteMenu(String id) throws Exception;
    void deleteChildRecord(String id) throws Exception;
}
