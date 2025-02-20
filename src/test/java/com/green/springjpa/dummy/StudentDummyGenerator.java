package com.green.springjpa.dummy;

import com.green.springjpa.entity.School;
import com.green.springjpa.entity.Student;
import com.green.springjpa.school.SchoolRepository;
import com.green.springjpa.student.StudentRepository;
import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Locale;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentDummyGenerator {
    @Autowired //TDD에서 DI받으실 때는 이 애노테이션으로 받아야 한다.
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    Faker faker = new Faker(new Locale("ko"));

    @Test
    @Rollback(false)
    void generate() {
        List<School> schoolList = schoolRepository.findAll();
        if(schoolList.isEmpty()) { return; }

        for(int i = 0; i < 10000; i++) {
            StringBuilder sb = new StringBuilder(faker.name().lastName());
            sb.append(faker.name().firstName());

            int rn = (int)(Math.random() * (schoolList.size()));

            Student student = Student.builder()
                    .name(sb.toString())
                    //.school(schools.get(rn))
                    .school(schoolList.get(faker.random().nextInt(schoolList.size()) ) )
                    .build();
            studentRepository.save(student);
        }
        studentRepository.flush();
    }

}
