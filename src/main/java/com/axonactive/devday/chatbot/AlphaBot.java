package com.axonactive.devday.chatbot;

import com.rivescript.Config;
import com.rivescript.RiveScript;

import java.io.IOException;

public class AlphaBot {
    private RiveScript bot;

    public AlphaBot() {
        bot = new RiveScript(Config.utf8());
        String rivescriptFilePath = AlphaBot.class.getClassLoader().getResource("rivescript").getFile();
        bot.loadDirectory(rivescriptFilePath);
        bot.sortReplies();
    }

    public String getMessage(String msg) {
        return bot.reply("tin", msg);

    }
}
