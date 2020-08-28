package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    IMenuService menuService;


    @RequestMapping(value="getAllMenu",method = RequestMethod.GET)
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }

    @RequestMapping(value="getUserMenu",method = RequestMethod.GET)
    public Result getUserMenu(String userId){
        return Result.succ(menuService.getUserMenu(userId));
    }

    @RequestMapping(value="insertMenu",method = RequestMethod.POST)
    public Result insertMenu(@RequestBody Menu menu){
        try {
            menuService.insertMenu(menu);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("保存菜单失败，请练习管理员");
        }
        return Result.succ("添加成功");
    }

    @RequestMapping(value="updateMenu",method = RequestMethod.POST)
    public Result updateMenu(@RequestBody Menu menu){
        try {
            menuService.updateMenu(menu);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("修改菜单失败，请练习管理员");
        }
        return Result.succ("添加成功");
    }

    @RequestMapping(value="deleteMenu",method = RequestMethod.GET)
    public Result deleteMenu(String menuId){
        try {
            /*
            先删子表
             */
            menuService.deleteChildRecord(menuId);
            /*
            再删父表
             */
            menuService.deleteMenu(menuId);
            /*
            存在子记录的话，一定是先删除子表
             */
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("删除菜单失败，请练习管理员");
        }
        return Result.succ("添加成功");
    }
}