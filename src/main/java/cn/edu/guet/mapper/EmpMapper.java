package cn.edu.guet.mapper;

import cn.edu.guet.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {

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
     * 删除职工
     *
     * @param empId 职工ID
     * @return 结果
     */
    void deleteEmp(String empId) throws Exception;

}
