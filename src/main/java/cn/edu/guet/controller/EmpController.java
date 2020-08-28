package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private IEmpService empService;

    /**
     * 职工列表
     */
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public Result list() {
        return Result.succ(empService.selectEmpList());
    }

}
