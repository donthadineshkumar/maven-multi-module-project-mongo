package org.lydsam.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    MongoOperations mongoOperations;

    @GetMapping(value = "/greet")
    public String greet(){
        Greetings greetings = mongoOperations.findOne(
                Query.query(Criteria.where("_id").is("5f47fbc62d50bf2687666ae1")),
                Greetings.class,
                "greetings"
        );
        return greetings.getMsg();
    }
}
