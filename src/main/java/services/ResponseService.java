package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseService {

	private static final Map<String, List<String>> responses = new HashMap<String, List<String>>();

	public ResponseService() {
		List<String> name = new ArrayList<String>() {
			{
				add("qual seu nome?");
				add("como se chama?");
			}
		};
		List<String> age = new ArrayList<String>() {
			{
				add("qual sua idade?");
				add("quantos anos você tem?");
			}
		};
		responses.put("ravel", name);
		responses.put("21", age);
	}

	public String getResponse(String userMessage) {
		userMessage = userMessage.toLowerCase();
		for (Map.Entry<String, List<String>> entry : responses.entrySet()) {
			if (entry.getValue().contains(userMessage)) {
				return entry.getKey();
			}
		}
		return "Não sei responder essa pergunta :P";
	}

}
