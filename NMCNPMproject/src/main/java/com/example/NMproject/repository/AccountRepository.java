package com.example.NMproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NMproject.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
	Optional<AccountEntity> findByEmailAndPassword(String email, String password);

	Optional<AccountEntity> findByEmail(String email);

	Optional<AccountEntity> findById(int id);
}
