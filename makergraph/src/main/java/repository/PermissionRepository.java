package repository;

import org.springframework.data.orient.object.repository.OrientObjectRepository;

import model.Permission;

/**
 * DAO for {@link Permission}.
 */
public interface PermissionRepository extends OrientObjectRepository<Permission> {

}