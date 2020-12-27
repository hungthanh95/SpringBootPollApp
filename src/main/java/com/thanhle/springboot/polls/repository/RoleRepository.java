package com.thanhle.springboot.polls.repository;

import com.thanhle.springboot.polls.entity.Role;
import com.thanhle.springboot.polls.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
