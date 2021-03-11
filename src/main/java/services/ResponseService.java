package services;

import org.telegram.telegrambots.meta.api.objects.Message;

public class ResponseService {

	public String lookForCommands(Message message) {
		if ((message.getText().toLowerCase().contains("qual") && message.getText().toLowerCase().contains("idade")) ||
		    (message.getText().toLowerCase().contains("quantos") && message.getText().toLowerCase().contains("anos"))){
			return "20";
		}
	   
		if ((message.getText().toLowerCase().contains("qual") && message.getText().toLowerCase().contains("nome")) ||
			    (message.getText().toLowerCase().contains("como") && message.getText().toLowerCase().contains("se chama"))){
				return "Ravel";
			}
		
			return "Não sei responder essa pergunta :P";
	
		
	}

	
}
