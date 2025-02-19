package com.green.springjpa.entity;

import com.green.springjpa.student.StudentRepository;
import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
//JPA Test
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentTest {
    @Autowired //TDD에서 DI받으실 때는 이 애노테이션으로 받아야 한다.
    private StudentRepository studentRepository;

    @Test
    @Transactional
    public void createStudent() {
        for(int i=0; i<100; i++) {
            Student student = Student.builder()
                    .name(String.format("홍길동%03d", i))
                    .build();
            studentRepository.save(student);
        }
        studentRepository.flush();
    }

}