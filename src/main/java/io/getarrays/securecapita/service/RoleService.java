package io.getarrays.securecapita.service;

import io.getarrays.securecapita.domain.Role;

import java.util.Collection;

/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */
public interface RoleService {
    Role getRoleByUserId(Long id);
    Collection<Role> getRoles();
}
