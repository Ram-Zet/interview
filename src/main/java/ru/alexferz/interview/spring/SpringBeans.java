package ru.alexferz.interview.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpringBeans {
    @Autowired
    private InjectedBean1 injectedBean1;

    public void doMainWork() {
        askInjectedBean();
        askInjectedBean();
        askInjectedBean();
    }

    private void askInjectedBean() {
        injectedBean1.doSmth();
    }
}

@Component
@Scope("prototype")
class InjectedBean1 {
    public void doSmth() {
        //some logic here
    }
}
