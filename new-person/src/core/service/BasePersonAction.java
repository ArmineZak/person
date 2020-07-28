package core.service;

import core.model.BasePerson;

public interface BasePersonAction {
    String eat(BasePerson person);
    String walk(BasePerson person);
    String learn (BasePerson person);

}
