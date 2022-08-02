package com.madhura.jwt_spring.dao;

import com.madhura.jwt_spring.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
}
