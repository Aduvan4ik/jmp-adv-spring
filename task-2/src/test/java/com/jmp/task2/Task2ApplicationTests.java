package com.jmp.task2;

import com.jmp.task2.entity.MyEntity;
import com.jmp.task2.repository.MyEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Task2ApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private MyEntityRepository myEntityRepository;

    @Test
    void contextLoads() {
        myEntityRepository.save(new MyEntity("TEST_VALUE"));

        assertEquals(1, myEntityRepository.findAll().size());
        assertTrue(applicationContext.containsBean("customDS"));
        assertFalse(applicationContext.containsBean("defaultDS"));
    }

}
