package com.groupon.model;

/**
 * Created by edward.rui on 2018/9/29.
 */
public class Goods {
    private long id;
    private String content;

    public Goods(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
