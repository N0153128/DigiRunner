

public class Ping implements Request {
	private Command command;

	public DoOne(Command command) {
		this.command = command;
	}

	public void execute() {
		command.Ping();
	}
}
