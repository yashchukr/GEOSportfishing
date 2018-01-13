package top.geosportfishing.auth.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import top.geosportfishing.auth.model.User;

import java.util.List;
import java.util.stream.Stream;

public interface UserRepository extends CrudRepository<User,Long>{

    List<User> findByEmail(String email);

    User findByUsername(String username);

    // custom query example and return a stream
    @Query("select c from User c where c.email = :email")
    Stream<User> findByEmailReturnStream(@Param("email") String email);

}
