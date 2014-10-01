package org.datamongo.jira.datamongo1064.repository;

import org.datamongo.jira.datamongo1064.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
