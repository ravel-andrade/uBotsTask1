package com.ravel.telegrambot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import bot.Bot;

@SpringBootApplication
public class TelegrambotTask1Application {

	public static void main(String[] args) {
		initializeBot();
	}
	
	private static void initializeBot() {
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = createLongPollingTelegramBotsApi();
		registerBot(telegramBotsApi);
	}

	private static void registerBot(TelegramBotsApi telegramBotsApi) {
		try {
			telegramBotsApi.registerBot(new Bot());
		} catch (TelegramApiException e) {

		}
	}

	private static TelegramBotsApi createLongPollingTelegramBotsApi() {
		return new TelegramBotsApi();
	}

}
