package com.jmp.task2.repository;


import com.jmp.task2.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, UUID> {
}
