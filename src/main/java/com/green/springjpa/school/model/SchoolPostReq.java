package com.green.springjpa.school.model;

import com.green.springjpa.entity.SchoolTypeCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SchoolPostReq {
    private String schoolName;
    private SchoolTypeCode typeCode;
}
