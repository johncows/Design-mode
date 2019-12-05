package com.kk.delegate.staticproxy;

public class ProxyFactory {
    public static Task getProxyTask(){
        return new ProxySubject(new RealSubject());
    }
}
