/**
 * 
 */
package com.main.redis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.redis.models.Student;

/**
 * @author sovannoty
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}