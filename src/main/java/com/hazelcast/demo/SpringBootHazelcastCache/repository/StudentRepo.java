package com.hazelcast.demo.SpringBootHazelcastCache.repository;

import com.hazelcast.demo.SpringBootHazelcastCache.Entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
