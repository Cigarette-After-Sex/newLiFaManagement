package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    /*
    Spring会自动注入menuMapper
     */
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }

    @Override
    public List<Menu> getUserMenu(String userId) {
        return menuMapper.getUserMenu(userId);
    }

    @Override
    public void insertMenu(Menu menu) throws Exception {
        menuMapper.insertMenu(menu);
    }

    @Override
    public void updateMenu(Menu menu) throws Exception {
        menuMapper.updateMenu(menu);
    }

    @Override
    public void deleteMenu(String id) throws Exception {
        menuMapper.deleteMenu(id);
    }

    @Override
    public void deleteChildRecord(String id) throws Exception {
        menuMapper.deleteChildRecord(id);
    }
}
