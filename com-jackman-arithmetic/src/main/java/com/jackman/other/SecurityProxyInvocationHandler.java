package com.jackman.other;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by JackManWu on 2016/10/31.
 */
public class SecurityProxyInvocationHandler implements InvocationHandler {
    private Object peoxyedObject;

    public SecurityProxyInvocationHandler(Object peoxyedObject) {
        this.peoxyedObject = peoxyedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (proxy instanceof Account && method.getName().equals("operation")) {
            SecurityChecker.checkSecurity();
        }
        return method.invoke(peoxyedObject,args);
    }
}
