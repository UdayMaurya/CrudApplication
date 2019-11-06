package com.secure.app;

import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends org.springframework.data.repository.CrudRepository<Student, Integer>{
	
}
