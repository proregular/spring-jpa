package com.green.springjpa.config.relationenum;

import com.green.springjpa.entity.SchoolTypeCode;
import com.green.springjpa.entity.StudentGradeTypeCode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
    @Configuration: 빈등록, 메소드 중에 @Bean 애노테이션을 가진 메소드가 있을 수 있다.
    @Bean: 빈등록, 스프링 컨테이너가 이 메소드를 호출 > 리턴된 주소값 빈등록

    @Configuration 아래에 있는 @Bean은 싱글톤이다.
 */
@Configuration
public class EnumCodeConfiguration {

    @Bean
    public EnumMapper enumMapper() {
        EnumMapper enumMapper = new EnumMapper();
        enumMapper.put(SchoolTypeCode.class.getSimpleName(), SchoolTypeCode.class);
        enumMapper.put(StudentGradeTypeCode.class.getSimpleName(), StudentGradeTypeCode.class);
        return enumMapper;
    }
}
