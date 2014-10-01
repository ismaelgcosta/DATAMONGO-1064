package org.datamongo.jira.datamongo1064.repository;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbConfigurationBuilder.mongoDb;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.mongodb.MongoDbConfiguration;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("persistence-test")
@ContextConfiguration(locations = "classpath:mongodb-solved-config.xml")
public class StudentSolvedRepositoryTest {

    public static final  MongoDbConfiguration PERSISTENCE_TEST =  mongoDb().databaseName("persistence-test").host("127.0.0.1").connectionIdentifier("system").build();
    
    @Rule
    public MongoDbRule mongoDbRule = new MongoDbRule(PERSISTENCE_TEST);

    @Autowired
    private StudentRepository repository;
    
    @Test
    @UsingDataSet(locations = "/test-data/students.json", loadStrategy = LoadStrategyEnum.CLEAN_INSERT)
    public void testTypeAliasWithEmbbedAbstractObject() {
        repository.findOne("abc");
        repository.findOne("abcd");
    }

}
