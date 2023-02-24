package com.playwithjava.demo.repository;

import com.playwithjava.demo.entity.UserDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserDataEntity,Long> {
}
