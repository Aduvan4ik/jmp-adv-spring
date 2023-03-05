package com.jmp.jmpadvspring;

import com.jmp.jmpadvspring.entity.MyEntity;
import com.jmp.jmpadvspring.repository.MyEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("DEV")
class JmpAdvSpringDevDataSourceTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private MyEntityRepository myEntityRepository;

    @Test
    void contextLoads() {
        myEntityRepository.save(new MyEntity("TEST_VALUE"));

        assertEquals(1, myEntityRepository.findAll().size());
        assertTrue(applicationContext.containsBean("devDS"));
        assertFalse(applicationContext.containsBean("defaultDS"));
        assertFalse(applicationContext.containsBean("qaDS"));
    }

}
