package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 开卡Controller
 */
@RestController
@RequestMapping("/vip")
public class VipController {

    @Autowired
    private IVipService vipService;

    /**
     * 开卡
     */
    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public Result add(@RequestBody Vip vip) {
        if (vipService.selectCountById(vip.getVipId()) > 0) {
            return Result.fail("会员卡号已存在,请更换");
        }
        return vipService.insertVip(vip) > 0 ? Result.succ("添加成功") : Result.fail("添加失败");
    }

    @RequestMapping(value = "/getAllList",method = RequestMethod.GET)
    public List<Vip> getAllList(){
        return vipService.getAllList();
    }

    @RequestMapping(value = "/getVipById",method = RequestMethod.POST)
    public List<Vip> getVipById(@Validated String vipId){
        return vipService.getVipById(vipId);
    }

    @RequestMapping(value = "/deleteVip",method = RequestMethod.POST)
    public Result deleteVip(@Validated String vipId){
        vipService.deleteVip(vipId);
        return Result.fail("删除成功");
    }

    @RequestMapping(value = "/updateVipList",method = RequestMethod.POST)
    public Result updateVipList(@Validated Vip vipId){
        vipService.updateVipList(vipId);
        return Result.fail("修改成功");
    }
}
