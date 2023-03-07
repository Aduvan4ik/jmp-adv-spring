package com.jmp.task1;

import com.jmp.task1.entity.MyEntity;
import com.jmp.task1.repository.MyEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Task1ApplicationTests {

    @Autowired
    private MyEntityRepository myEntityRepository;

    @Test
    void contextLoads() {
        myEntityRepository.save(new MyEntity("TEST_VALUE"));

        assertEquals(1, myEntityRepository.findAll().size());
    }

}
