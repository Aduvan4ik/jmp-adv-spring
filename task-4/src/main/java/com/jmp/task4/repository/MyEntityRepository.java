package com.jmp.task4.repository;


import com.jmp.task4.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, UUID> {
}
