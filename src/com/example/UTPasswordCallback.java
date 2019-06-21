package com.example;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

public class UTPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) {
        for (Callback callback : callbacks) {
            WSPasswordCallback pc = (WSPasswordCallback) callback;
            pc.setIdentifier("arash");
            pc.setPassword("123");
        }
    }
}
