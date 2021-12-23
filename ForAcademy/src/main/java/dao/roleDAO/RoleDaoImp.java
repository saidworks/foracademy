package dao.roleDAO;

import models.Role;
import utils.DBException;
import utils.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImp implements IroleDao {
    @Override
    public void saveRole(Role role) {
        Connection connection = null;
        try {
            connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO role(nom_role) VALUES(?)");
            ps.setString(1, role.getNom_role());
            int i = ps.executeUpdate();
            if (i == 1){
                System.out.println("succes insert role: "+ role.getNom_role());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBUtil.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM role");

            while (rs.next()){
                int id = rs.getInt("id_role");
                String name = rs.getString("nom_role");
                Role role = new Role(id, name);
                roles.add(role);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public Role selectRoleById(int id) {
        Connection connection = null;
        try {
            connection = DBUtil.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM role whiere id ="+id);

            while (rs.next()){
                int id_role = rs.getInt("id_role");
                String role_name = rs.getString("nom_role");
                Role role = new Role(id_role, role_name);

                return role;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void deleteRole(int id) {
        Connection connection = null;
        try {
            connection = DBUtil.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("DELETE * FROM role whiere id =" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void updateRole(Role role) {
        Connection connection = null;

        try {
            connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE role SET name=? WHERE id="+role.getId_role());
            ps.setString(1,role.getNom_role() );
            int i = ps.executeUpdate();
            if (i == 1){
                System.out.println("succes update role : "+role.getNom_role());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
