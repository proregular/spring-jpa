package com.green.springjpa.student;

import com.green.springjpa.student.model.StudentRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Page<List<StudentRes>> getStudentList(Pageable pageable) {
        return studentRepository.findList(pageable);
    }
}
