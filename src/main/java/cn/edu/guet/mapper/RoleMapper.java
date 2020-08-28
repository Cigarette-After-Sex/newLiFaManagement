package cn.edu.guet.mapper;

import cn.edu.guet.exception.SaveException;
import cn.edu.guet.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    void insertRole(@Param("userId") String userId, @Param("roleId") String roleId);
    void deleteRole(Role role);
    Role getRoleById(String roleId);
    Role getRoleByUserId(String userId);
}
