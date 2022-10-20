package ru.adrenoxxxrom.security.services;

import ru.adrenoxxxrom.security.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    List<Role> getRoleById(Long id);
}