package com.blend.architecture.eventbus.response;

public class ResponceBean {

    private Object data;//UserManager

    public ResponceBean(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
