package com.wyq.springboot_learning.entiey;

import java.util.Date;

public class Message {
    private int id;
    private Date date;
    private String message;

    public Message() {
    }

    public Message(int id, Date date, String message) {
        this.id = id;
        this.date = date;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
