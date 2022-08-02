package com.madhura.jwt_spring.service;

import com.madhura.jwt_spring.dao.RoleDao;
import com.madhura.jwt_spring.dao.UserDao;
import com.madhura.jwt_spring.entity.Role;
import com.madhura.jwt_spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Privilege");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User Privilege");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserName("admin123");
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        User user = new User();
        user.setUserName("sam123");
        user.setUserFirstName("john");
        user.setUserLastName("sam");
        user.setUserPassword("sam@pass");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);


    }
}
