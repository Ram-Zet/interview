package ru.alexferz.interview.spring;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpringTransactions {

    @Transactional
    public void doSomeWork() {
        goToDb();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void goToDb(){
        //some work with DB
    }
}
