/**
 * 
 */
package com.main.redis.models;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

/**
 * @author sovannoty
 *
 */
@RedisHash("Student")
public class Student implements Serializable {
  

	public enum Gender { 
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
	/**
	 * @param id
	 * @param name
	 * @param gender
	 * @param grade
	 */
	public Student(String id, String name, Gender gender, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", grade=" + grade + "]";
	}
    
    
    
    // ...
}