package com.madhura.jwt_spring.service;

import com.madhura.jwt_spring.dao.RoleDao;
import com.madhura.jwt_spring.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
