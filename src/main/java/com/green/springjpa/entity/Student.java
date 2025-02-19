package com.green.springjpa.entity;

import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student  extends UpdatedAt {

    @Id @Tsid
    private Long studentId;

    @Column(nullable = false)
    private String name;

}
