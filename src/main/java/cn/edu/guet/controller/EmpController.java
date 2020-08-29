package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    IEmpService empService;

    @RequestMapping(value="getAllEmp",method = RequestMethod.GET)
    public List<Emp> getAllEmp(){
        return  empService.getAllEmp();
    }
    @RequestMapping(value="getSoloEmp",method = RequestMethod.GET)
    public List<Emp> getSoloEmp(String empId){
        return empService.getSoloEmp(empId);
    }
    @PostMapping("insertEmp")
    public Result insertEmp(@Validated @RequestBody Emp emp){
        try {
            empService.insertEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("添加员工失败，请联系管理员");
        }
        return Result.succ("添加成功");
    }
    @RequestMapping(value="deleteEmp",method = RequestMethod.GET)
    public Result deleteEmp(String empId){
        try {
            empService.deleteEmp(empId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("删除员工失败，请联系管理员");
        }
        return Result.succ("删除成功");
    }
    @RequestMapping(value="updateEmp",method = RequestMethod.POST)
    public Result updateEmp(@RequestBody Emp emp){
        try {
            empService.updateEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("修改员工失败，请联系管理员");
        }
        return Result.succ("修改成功");
    }
}
