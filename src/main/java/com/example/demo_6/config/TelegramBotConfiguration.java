package com.example.demo_6.config;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.DeleteMyCommands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class TelegramBotConfiguration {
//@Bean
   // public TelegramBot telegramBot(@Value("6248275584:AAG4oP9qOhPXK6O8p9mMWMQ2Obu7Zv_VwHA") String token){
       // return new TelegramBot(token);
@Value("${6248275584:AAG4oP9qOhPXK6O8p9mMWMQ2Obu7Zv_VwHA}")
    private String token;

    @Bean
    public TelegramBot telegramBot() {
        TelegramBot bot = new TelegramBot(token);
        bot.execute(new DeleteMyCommands());
        return bot;
    }
}
