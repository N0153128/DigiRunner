public class Share implements Request {
	private Command command;

	public Share(Command command) {
		this.command = command;
	}

	public void execute(String text) {
		command.Share(text);
	}

}
