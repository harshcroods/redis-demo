package com.redisdemo.redisdemo.repositories;

import com.redisdemo.redisdemo.models.StudentVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentVo, Long> {
}
