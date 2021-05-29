package com.jwhuang42.regisapp.repository;

import com.jwhuang42.regisapp.model.User;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUserNameAndUserPassword(String userName, String userPassword);
}
