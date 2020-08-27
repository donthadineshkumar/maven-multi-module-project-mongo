package org.lydsam.sales;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Greetings {
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
