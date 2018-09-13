package com.axonactive.devday.bean;

import com.axonactive.devday.chatbot.AlphaBot;

import javax.annotation.ManagedBean;

@ManagedBean("homeBean")
public class HomeBean {

    private String msg;
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void getMessage() {
        AlphaBot bot = new AlphaBot();
        this.answer = bot.getMessage(this.msg);
    }
}
