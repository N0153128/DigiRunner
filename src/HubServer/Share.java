public class Share implements Request {
	private Command command;
	public String text;

	public Share(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.Share(this.text);
	}

}
