package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		
		if (update.hasMessage() && update.getMessage().hasText()) {
			SendMessage message = createSendMessageWithMandatoryFields(update);
			send(message);
			
		}
	}

	public SendMessage createSendMessageWithMandatoryFields(Update update) {
		SendMessage message = new SendMessage().setChatId(
				update.getMessage().getChatId()).setText(update.getMessage().getText());
		return message;
	}
	
	public void send(SendMessage message) {
		try {
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getBotUsername() {

		return null;
	}

	@Override
	public String getBotToken() {

		return "1674642041:AAFTMDdMoKUSiCaWrOUpdh5V5ZKDcdM4Od0";
	}

}
