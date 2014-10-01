package org.datamongo.jira.datamongo1064;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.domain.Persistable;

@TypeAlias("student")
public class Student implements Persistable<String>{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
    
}
