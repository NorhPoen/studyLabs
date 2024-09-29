package org.ISKor.repositories;

import org.ISKor.entity.Owner;
import org.ISKor.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByUsername(String username);
    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByOwner(Owner owner);
}