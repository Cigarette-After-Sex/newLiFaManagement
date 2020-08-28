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
    private EmpMapper empMapper;

    /**
     * 查询职工
     *
     * @param empId 职工ID
     * @return 职工
     */
    @Override
    public Emp selectEmpById(String empId) {
        return empMapper.selectEmpById(empId);
    }

    /**
     * 查询职工列表
     *
     * @return 职工
     */
    @Override
    public List<Emp> selectEmpList() {
        return empMapper.selectEmpList();
    }

    /**
     * 新增职工
     *
     * @param emp 职工
     * @return 结果
     */
    @Override
    public int insertEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    /**
     * 修改职工
     *
     * @param emp 职工
     * @return 结果
     */
    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateEmp(emp);
    }

    /**
     * 删除职工信息
     *
     * @param empId 职工ID
     * @return 结果
     */
    @Override
    public int deleteEmpById(String empId) {
        return empMapper.deleteEmpById(empId);
    }
}
