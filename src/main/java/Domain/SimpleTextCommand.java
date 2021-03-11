package Domain;

public class SimpleTextCommand {
	private String command;
	private String response;
	
	public SimpleTextCommand(String command, String response) {
		this.command = command;
		this.response = response;
	}
	
	public void editCommand(String newCommand) {
		this.command = newCommand;
	}
	
	public void editResponse(String newResponse) {
		this.response = newResponse;
	}
}
