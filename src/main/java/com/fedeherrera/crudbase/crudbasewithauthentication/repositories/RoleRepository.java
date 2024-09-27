package com.fedeherrera.crudbase.crudbasewithauthentication.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fedeherrera.crudbase.crudbasewithauthentication.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
    
}
