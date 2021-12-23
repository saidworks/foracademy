package dao.roleDAO;

import models.Role;

import java.util.List;

public interface IroleDao {
    void saveRole(Role role);
    List<Role> getAllRoles();

    Role selectRoleById(int id);

    void deleteRole(int id);

    void updateRole(Role role);
}
