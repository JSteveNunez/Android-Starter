package com.jstevenunez.androidstarter.bean;

/**
 * Created by steven on 2/23/2015.
 */
public class RestResponse<E> {
    private String[] messages;
    private E result;

    public RestResponse() {
    }

    public RestResponse(String[] messages, E result) {
        this.messages = messages;
        this.result = result;
    }

    public String[] getMessages() {
        return messages;
    }

    public E getResult() {
        return result;
    }
}
