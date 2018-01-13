package top.geosportfishing.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.geosportfishing.auth.model.Role;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role,Long> {

    List<Role> findByCreator(String creator);



}
