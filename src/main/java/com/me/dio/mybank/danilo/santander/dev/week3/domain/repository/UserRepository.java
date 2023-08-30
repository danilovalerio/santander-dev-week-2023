package com.me.dio.mybank.danilo.santander.dev.week3.domain.repository;

import com.me.dio.mybank.danilo.santander.dev.week3.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
