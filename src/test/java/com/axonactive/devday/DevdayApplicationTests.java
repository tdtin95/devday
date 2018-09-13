package com.axonactive.devday;

import com.axonactive.devday.chatbot.AlphaBot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevdayApplicationTests {


    @Test
    public void shouldReturnCorrectAnswer() {
        AlphaBot bot = new AlphaBot();
        System.out.println(bot.getMessage("hello bot"));
    }

}
