package com.upc.autentication.repository;

import com.upc.autentication.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT U FROM User U Where U.code = :code")
    List<User> findUserBy(@Param("code") Long code);

    @Query("SELECT U FROM User U Where U.email = :email and U.password = :password")
    List<User> login(@Param("email") String email, @Param("password") String password);
}
