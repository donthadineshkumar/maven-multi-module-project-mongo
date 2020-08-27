package org.lydsam.sales;

import com.mongodb.MongoSocketOpenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CompleteExceptionHandler extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(CompleteExceptionHandler.class);

    @ExceptionHandler(MongoSocketOpenException.class)
    public void handleMongoDBDownException(){
        logger.error("MongoDB is down");
    }

}
