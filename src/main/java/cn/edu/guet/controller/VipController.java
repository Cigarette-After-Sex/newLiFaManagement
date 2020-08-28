package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.VipList;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vipList")
public class VipController {

    @Autowired
    IVipService vipService;

    @RequestMapping(value = "/getAllList",method = RequestMethod.GET)
    public List<VipList> getAllList(){
        return vipService.getAllList();
    }

    @RequestMapping(value = "/getVipById",method = RequestMethod.POST)
    public List<VipList> getVipById(@Validated String vipid){
        return vipService.getVipById(vipid);
    }

    @RequestMapping(value = "deleteVip",method = RequestMethod.POST)
    public Result deleteVip(@Validated String vipid){
        vipService.deleteVip(vipid);
        return Result.fail("删除成功");
    }

    @RequestMapping(value = "updateVip",method = RequestMethod.POST)
    public Result updateVip(@Validated VipList vipid){
        vipService.updateVip(vipid);
        return Result.fail("修改成功");
    }
}
