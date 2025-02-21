package com.green.springjpa.entity;

import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class School extends CreatedAt {
    @Id @Tsid
    private Long schoolId;

    @Column(nullable = false)
    @Convert(converter = SchoolTypeCode.CodeConvert.class)
    private SchoolTypeCode schoolTypeCode;

    @Column(nullable = false, length = 50)
    private String name;
}
