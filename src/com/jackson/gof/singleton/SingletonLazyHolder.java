package com.jackson.gof.singleton;

import static com.jackson.gof.singleton.SingletonLazyHolder.InstanceHolder.instancia;

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
