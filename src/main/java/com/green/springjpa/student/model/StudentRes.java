package com.green.springjpa.student.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StudentRes {
    private Long studentId;
    private String name;
    private LocalDateTime createAt;

    public StudentRes(Long studentId, String name, LocalDateTime createAt) {
        this.studentId = studentId;
        this.name = name;
        this.createAt = createAt;
    }
}
