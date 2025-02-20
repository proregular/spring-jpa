package com.green.springjpa.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class StudentReq {
    private Long studentId;
    private String name;
    private LocalDateTime createdAt;
}
