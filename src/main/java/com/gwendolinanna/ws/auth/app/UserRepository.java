package com.gwendolinanna.ws.auth.app;

import com.gwendolinanna.ws.auth.app.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Johnkegd
 */

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findUserByEmail(String email);

    UserEntity findUserByName(String firstName, String lastName);

}
