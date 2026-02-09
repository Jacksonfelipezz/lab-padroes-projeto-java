package com.jackson.gof;

import static com.jackson.gof.SingletonLazyHolder.InstanceHolder.instancia;

/*
* Singleton "Lazy Holder"
*
* */
public class SingletonLazyHolder {

    static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return instancia;
    }
}
