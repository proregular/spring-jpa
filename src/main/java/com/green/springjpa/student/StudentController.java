package com.green.springjpa.student;

import com.green.springjpa.student.model.StudentReq;
import com.green.springjpa.student.model.StudentRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public Page<List<StudentRes>> getStudentList(@RequestParam(defaultValue = "0") int page
                                               , @RequestParam(defaultValue = "20") int size) {
        return studentService.getStudentList(PageRequest.of(page, size));
    }

    @GetMapping("test")
    public String test2(@RequestParam LocalDateTime createdAt) {
        log.info("createdAt: {}", createdAt);
        return "";
    }

    @PostMapping("test")
    public String test(@RequestBody StudentReq req) {
        log.info("req: {}", req);
        return "";
    }

}
