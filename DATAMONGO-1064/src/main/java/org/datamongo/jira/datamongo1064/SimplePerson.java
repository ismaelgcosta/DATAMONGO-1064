package org.datamongo.jira.datamongo1064;

import javax.persistence.Embeddable;

import org.springframework.data.annotation.TypeAlias;

@Embeddable //FIXME Correction for issue 
@TypeAlias("simplePerson")
public class SimplePerson extends Person {

}
