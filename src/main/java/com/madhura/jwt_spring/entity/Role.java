package com.madhura.jwt_spring.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Role {

    @Id
    private String roleName;
    private String roleDescription;
}
