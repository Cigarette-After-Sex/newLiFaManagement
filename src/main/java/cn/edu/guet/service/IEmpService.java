package cn.edu.guet.service;

import cn.edu.guet.model.Emp;

import java.util.List;

public interface IEmpService {

    /**
     * 查询职工
     *
     * @param empId 职工ID
     * @return 职工
     */
    public Emp selectEmpById(String empId);

    /**
     * 查询职工列表
     *
     * @return 职工集合
     */
    public List<Emp> selectEmpList();

    /**
     * 新增职工
     *
     * @param emp 职工
     * @return 结果
     */
    public int insertEmp(Emp emp);

    /**
     * 修改职工
     *
     * @param emp 职工
     * @return 结果
     */
    public int updateEmp(Emp emp);

    /**
     * 删除职工信息
     *
     * @param empId 职工ID
     * @return 结果
     */
    public int deleteEmpById(String empId);
}
