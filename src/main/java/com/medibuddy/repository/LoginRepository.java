package com.medibuddy.repository;

import com.medibuddy.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

    Optional<Login> findByEmail(String email);


}
