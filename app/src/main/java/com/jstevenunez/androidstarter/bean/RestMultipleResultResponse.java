package com.jstevenunez.androidstarter.bean;

import java.util.List;

/**
 * Created by steven on 2/23/2015.
 */
public class RestMultipleResultResponse<K> extends RestResponse<List<K>> {
    public RestMultipleResultResponse() {
    }

    public RestMultipleResultResponse(String[] messages, List<K> result) {
        super(messages, result);
    }
}
