package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.EmpMapper;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public List<Emp> getSoloEmp(String empId) {
        return empMapper.getSoloEmp(empId);
    }

    @Override
    public void insertEmp(Emp emp) throws Exception{
        empMapper.insertEmp(emp);
    }

    @Override
    public void deleteEmp(String empId) throws Exception {
        empMapper.deleteEmp(empId);
    }

    @Override
    public void updateEmp(Emp emp) throws Exception {
        empMapper.updateEmp(emp);
    }


}
