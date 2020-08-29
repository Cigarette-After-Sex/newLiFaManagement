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
    List<Emp> getSoloEmp(String empId);

    /**
     * 查询职工列表
     *
     * @return 职工集合
     */
    List<Emp> getAllEmp();

    /**
     * 新增职工
     *
     * @param emp 职工
     * @return 结果
     */
    void insertEmp(Emp emp) throws Exception;

    /**
     * 修改职工
     *
     * @param emp 职工
     * @return 结果
     */
    void updateEmp(Emp emp) throws Exception;

    /**
     * 删除职工信息
     *
     * @param empId 职工ID
     * @return 结果
     */
    void deleteEmp(String empId) throws Exception;
}
